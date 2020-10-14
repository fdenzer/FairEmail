package eu.faircode.email;

/*
    This file is part of FairEmail.

    FairEmail is free software: you can redistribute it and/or modify
    it under the terms of the GNU General Public License as published by
    the Free Software Foundation, either version 3 of the License, or
    (at your option) any later version.

    FairEmail is distributed in the hope that it will be useful,
    but WITHOUT ANY WARRANTY; without even the implied warranty of
    MERCHANTABILITY or FITNESS FOR A PARTICULAR PURPOSE.  See the
    GNU General Public License for more details.

    You should have received a copy of the GNU General Public License
    along with FairEmail.  If not, see <http://www.gnu.org/licenses/>.

    Copyright 2018-2020 by Marcel Bokhorst (M66B)
*/

import android.content.Context;
import android.content.res.XmlResourceParser;
import android.text.TextUtils;

import org.xmlpull.v1.XmlPullParser;

import java.util.ArrayList;
import java.util.List;

public class Contributor {
    public String name;
    public String alias;
    public String contribution;

    private Contributor() {
    }

    static List<Contributor> loadContributors(Context context) {
        List<Contributor> result = null;
        try {
            Contributor contributor = null;
            XmlResourceParser xml = context.getResources().getXml(R.xml.contributors);
            int eventType = xml.getEventType();
            while (eventType != XmlPullParser.END_DOCUMENT) {
                if (eventType == XmlPullParser.START_TAG) {
                    String name = xml.getName();
                    if ("contributors".equals(name))
                        result = new ArrayList<>();
                    else if ("contributor".equals(name)) {
                        contributor = new Contributor();
                        contributor.name = xml.getAttributeValue(null, "name");
                        contributor.alias = xml.getAttributeValue(null, "alias");
                        contributor.contribution = xml.getAttributeValue(null, "contribution");
                    } else
                        throw new IllegalAccessException(name);
                } else if (eventType == XmlPullParser.END_TAG) {
                    if ("contributor".equals(xml.getName())) {
                        result.add(contributor);
                        contributor = null;
                    }
                }

                eventType = xml.next();
            }
        } catch (Throwable ex) {
            Log.e(ex);
        }

        return result;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();

        if (!TextUtils.isEmpty(name))
            sb.append(name);

        if (!TextUtils.isEmpty(alias)) {
            if (sb.length() > 0)
                sb.append(' ');
            if (!TextUtils.isEmpty(name))
                sb.append('(');
            sb.append(alias);
            if (!TextUtils.isEmpty(name))
                sb.append(')');
        }

        sb.append(" - ");

        if (!TextUtils.isEmpty(contribution)) {
            if (sb.length() > 0)
                sb.append(' ');
            sb.append(contribution);
        }

        return sb.toString();
    }
}
