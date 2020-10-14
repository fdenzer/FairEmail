# j*******5@gmail.com

Si tiene una pregunta, compruebe primero las preguntas frecuentes. En la parte inferior encontrará cómo hacer otras preguntas, solicitar funcionalidades y reportar errores.

## Índice

* [Autorizando cuentas](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-authorizing-accounts)
* [¿Cómo ...?](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-howto)
* [Problemas conocidos](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-known-problems)
* [Características planificadas](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-planned-features)
* [Características solicitadas con frecuencia](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-frequently-requested-features)
* [Preguntas frecuentes](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-frequently-asked-questions)
* [Soporte](https://github.com/M66B/FairEmail/blob/master/FAQ.md#user-content-support)

## Autorizando cuentas

En la mayoría de los casos, la configuración rápida será capaz de identificar automáticamente la configuración correcta.

Si la configuración rápida falla, deberá configurar manualmente una cuenta (para recibir correo electrónico) y una identidad (para enviar correo electrónico). Para esto necesitarás las direcciones IMAP y SMTP y números de puerto, si SSL/TLS o STARTTLS deben ser usados y su nombre de usuario (generalmente, pero no siempre, su dirección de correo electrónico) y su contraseña.

Buscar *IMAP* y el nombre del proveedor es generalmente suficiente para encontrar la documentación correcta.

En algunos casos necesitará habilitar el acceso externo a su cuenta y/o utilizar una contraseña especial de aplicación, por ejemplo cuando la autenticación de dos factores esté habilitada.

Para autorización:

* Gmail / G suite, ver [pregunta 6](#user-content-faq6)
* Outlook / Live / Hotmail, ver [pregunta 14](#user-content-faq14)
* Office 365, ver [pregunta 14](#user-content-faq156)
* Microsoft Exchange: ver [pregunta 8](#user-content-faq8)
* Yahoo, AOL y Sky, ver [pregunta 88](#user-content-faq88)
* Apple iCloud, ver [pregunta 148](#user-content-faq148)
* Free.fr, ver [pregunta 157](#user-content-faq157)

Por favor vea [aquí](#user-content-faq22) para mensajes de error y soluciones más comunes.

Preguntas relacionadas:

* [¿Es compatible con OAuth?](#user-content-faq111)
* [¿Por qué ActiveSync no es compatible?](#user-content-faq133)

<a name="howto">

## ¿Cómo ...?

* Cambiar el nombre de la cuenta: Ajustes, paso 1, Gestionar, tocar cuenta
* Cambiar el objetivo del deslizamiento a la izquierda/derecha: Ajustes, comportamiento, Definir acciones de deslizamiento
* Cambiar contraseña: Ajustes, paso 1, Gestionar, tocar cuenta, cambiar contraseña
* Establecer una firma: Ajustes, paso 2, Gestionar, tocar identidad, Editar firma.
* Añadir dirección CC y CCO: toque el icono de la persona al final del asunto
* Ir al mensaje siguiente/anterior en archivar/eliminar: en la configuración de comportamiento desactive *Cerrar conversaciones automáticamente* y seleccione *Ir a la siguiente/anterior conversación* para *Al cerrar una conversación*
* Añadir una carpeta a la bandeja de entrada unificada: mantenga presionada la carpeta en la lista de carpetas y marque *Mostrar en la bandeja de entrada unificada*
* Añadir una carpeta al menú de navegación: mantenga presionada la carpeta en la lista de carpetas y marque *Mostrar en el menú de navegación*
* Cargar más mensajes: mantenga presionada una carpeta en la lista de carpetas, seleccione *Sincronizar más mensajes*
* Eliminar un mensaje, omitiendo la papelera: en el menú de 3 puntos justo encima del texto del mensaje *Eliminar* o, alternativamente, desmarque la carpeta de la papelera en la configuración de la cuenta
* Eliminar una cuenta/identidad: Ajustes paso 1/2, Gestionar, tocar cuenta/identidad, menú de tres puntos, Eliminar
* Eliminar una carpeta: mantenga pulsada la carpeta de la lista de carpetas, Editar propiedades, menú de tres puntos, Eliminar
* Deshacer enviar: Bandeja de salida, toque mensaje, toque el icono deshacer
* Guardar mensajes enviados en la bandeja de entrada: por favor [vea estas Preguntas Frecuentes](#user-content-faq142)
* Cambiar carpetas del sistema: Ajustes, paso 1, gestión, toque cuenta, en la parte inferior
* Importar/Exportar ajustes: Ajustes, menu de navegación

## Problemas conocidos

* ~~Un [error en Android 5.1 y 6](https://issuetracker.google.com/issues/37054851) hace que las aplicaciones muestren a veces un formato de hora incorrecto. Cambiar la configuración de Android *Usar formato de 24 horas* podría resolver temporalmente el problema. Una solución fue añadida.~~
* ~~~Un [error en Google Drive](https://issuetracker.google.com/issues/126362828) hace que los archivos exportados a Google Drive estén vacíos. Google ha corregido esto.~~
* ~~Un [error en AndroidX](https://issuetracker.google.com/issues/78495471) hace que FairEmail ocasionalmente se cierre al mantener presionado o deslizar. Google ha corregido esto.~~
* ~~Un [error en AndroidX ROOM](https://issuetracker.google.com/issues/138441698) causa a veces un cierre con "*... Excepción al computar datos en vivo de base de datos ... No se pudo leer la fila...*". Se añadió una solución alternativa.~~
* Un [error en Android](https://issuetracker.google.com/issues/119872129) hace que FairEmail falle con "*... Notificación errónea publicada ...*" en algunos dispositivos una vez después de actualizar FairEmail y pulsar en una notificación.
* Un [error en Android](https://issuetracker.google.com/issues/62427912) ocasiona a veces un error con "*... ActivityRecord no encontrado para ...*" después de actualizar FairEmail. Reinstalando ([fuente](https://stackoverflow.com/questions/46309428/android-activitythread-reportsizeconfigurations-causes-app-to-freeze-with-black)) podría solucionar el problema.
* Un [error en Android](https://issuetracker.google.com/issues/37018931) ocasiona a veces un error con *... InputChannel no está inicializado ...* en algunos dispositivos.
* ~~Un [error en LineageOS](https://review.lineageos.org/c/LineageOS/android_frameworks_base/+/265273) causa a veces un error con *... java.lang.ArrayIndexOutOfBoundsException: length=...; index=... ...*.~~
* Un error en Nova Launcher en Android 5.x hace que FairEmail falle con un *java.lang.StackOverflowError* cuando Nova Launcher tiene acceso al servicio de accesibilidad.
* ~~El selector de carpetas a veces no muestra carpetas por razones desconocidas. Esto parece estar arreglado.~~
* ~~Un [error en AndroidX](https://issuetracker.google.com/issues/64729576) hace difícil agarrar el desplazamiento rápido. Una solución fue añadida.~~
* ~~El cifrado con YubiKey resulta en un bucle infinito. Esto parece ser causado por un [error en OpenKeychain](https://github.com/open-keychain/open-keychain/issues/2507).~~
* Desplazar a una ubicación vinculada internamente en mensajes originales no funciona. Esto no se puede arreglar porque la vista original del mensaje está contenida en una vista de desplazamiento.
* La vista previa del texto de los mensajes no aparece (siempre) en los relojes de Samsung porque [setLocalOnly](https://developer.android.com/reference/androidx/core/app/NotificationCompat.Builder.html#setLocalOnly(boolean)) parece ser ignorado. El texto de vista previa de los mensajes se muestra correctamente en Pebble 2, Fitbit Charge 3 y Mi band 3. Ver también [estas Preguntas Frecuentes](#user-content-faq126).
* Un [error en Android 6.0](https://issuetracker.google.com/issues/37068143) causa un error con *... Offset inválido: ... El rango válido es ...* cuando el texto está seleccionado y se toca fuera del texto seleccionado. Este error ha sido corregido en Android 6.0.1.
* Los enlaces internos (anchor) no funcionarán porque los mensajes originales se muestran en una WebView embebida en una vista de desplazamiento (la lista de conversaciones). Esta es una limitación de Android que no se puede arreglar o eludir.

## Características planificadas

* ~~Sincronizar bajo demanda (manual)~~
* ~~Cifrado semi automático ~~
* ~~Copiar mensaje~~
* ~~Estrellas de colores~~
* ~~Ajustes de notificación por carpeta~~
* ~~Seleccionar imágenes locales para firmas~~ (esto no se añadirá porque requiere administración de archivos de imagen y porque las imágenes no se muestran por defecto en la mayoría de los clientes de correo electrónico)
* ~~Mostrar mensajes que coincidan con una regla~~
* ~~[ManageSieve](https://tools.ietf.org/html/rfc5804)~~ (no hay librerías Java mantenidas con una licencia adecuada y sin dependencias y, además, FairEmail tiene sus propias reglas de filtro)
* ~~Buscar mensajes con/sin archivos adjuntos~~ (esto no puede ser añadido porque IMAP no soporta la búsqueda de archivos adjuntos)
* ~~Buscar una carpeta~~ (filtrar una lista jerárquica de carpetas es problemático)
* ~~Sugerencias de búsqueda~~
* ~~[Mensaje de configuración de autocifrado](https://autocrypt.org/autocrypt-spec-1.0.0.pdf) (sección 4.4)~~ (en mi opinión no es una buena idea permitir que un cliente de correo electrónico maneje claves de cifrado sensibles para un caso de uso excepcional mientras que OpenKeychain también puede exportar claves)
* ~~Carpetas unificadas genéricas~~
* ~~Nuevo programa de notificación de mensajes por cuenta~~ (implementado añadiendo una condición de tiempo a las reglas para que los mensajes puedan ser pospuestos durante los periodos seleccionados)
* ~~Copiar cuentas e identidades~~
* ~~Zoom via pellizco~~ (no es posible en una lista de desplazamiento; la vista completa del mensaje puede ser agrandada en su lugar)
* ~~Vista de carpetas más compacta~~
* ~~Componer listas y tablas~~ (requiere un editor de texto enriquecido, vea [estas FAQ](#user-content-faq99))
* ~~Pellizcar para hacer zoom en el tamaño de texto~~
* ~~Mostrar GIFs~~
* ~~Temas~~ (un tema gris claro y uno oscuro fueron añadidos porque esto es lo que la mayoría de la gente parece querer)
* ~~Cualquier condición de hora del día~~ (cualquier día no encaja realmente en la condición de fecha/hora)
* ~~Enviar como adjunto~~
* ~~Widget para la cuenta seleccionada~~
* ~~Recordar adjuntar archivos~~
* ~~Seleccionar dominios para los cuales mostrar imágenes~~ (esto será demasiado complicado de usar)
* ~~Vista de mensajes favoritos unificada~~ (ya hay una búsqueda especial para esto)
* ~~Mover acción de notificación~~
* ~~Soporte para S/MIMEe~~
* ~~Buscar ajustes~~

Cualquier cosa en esta lista está en orden aleatorio y *podría* ser añadida en un futuro próximo.

## Características solicitadas con frecuencia

El diseño está basado en muchas discusiones y si lo deseas puedes unirte a la discusión [en este foro](https://forum.xda-developers.com/android/apps-games/source-email-t3824168). El objetivo del diseño es ser minimalista (sin menús innecesarios, botones, etc.) y no distraer (colores brillantes, animaciones, etc.). Todas las cosas mostradas deben ser útiles de una u otra manera y deben posicionarse cuidadosamente para un uso fácil. Fuentes, tamaños, colores, etc debe seguir el diseño material siempre que sea posible.

## Preguntas frecuentes

* [(1) ¿Qué permisos se necesitan y por qué?](#user-content-faq1)
* [(2) ¿Por qué se muestra una notificación permanente?](#user-content-faq2)
* [(3) ¿Qué son las operaciones y por qué están pendientes?](#user-content-faq3)
* [(4) ¿Cómo puedo utilizar un certificado de seguridad no válido / contraseña vacía / conexión de texto plano?](#user-content-faq4)
* [(5) ¿Cómo puedo personalizar la vista de mensajes?](#user-content-faq5)
* [(6) ¿Cómo puedo iniciar sesión en Gmail / G suite?](#user-content-faq6)
* [(7) ¿Por qué los mensajes enviados no aparecen (directamente) en la carpeta de enviados?](#user-content-faq7)
* [(8) ¿Puedo utilizar una cuenta de Microsoft Exchange?](#user-content-faq8)
* [(9) ¿Qué son las identidades / cómo agregar un alias?](#user-content-faq9)
* [~~(11) ¿Por qué no se admite POP?~~](#user-content-faq11)
* [~~(10) ¿Qué significa 'UIDPLUS no soportado'?~~](#user-content-faq10)
* [(12) ¿Cómo funciona el cifrado/descifrado?](#user-content-faq12)
* [(13) ¿Cómo funciona la búsqueda en dispositivo/servidor?](#user-content-faq13)
* [(14) ¿Cómo puedo configurar una cuenta de Outlook / Live / Hotmail?](#user-content-faq14)
* [(15) ¿Por qué sigue cargando el texto del mensaje?](#user-content-faq15)
* [(16) ¿Por qué no se sincronizan los mensajes?](#user-content-faq16)
* [~~(17) ¿Por qué no funciona la sincronización manual?~~](#user-content-faq17)
* [(18) ¿Por qué no se muestra siempre la vista previa del mensaje?](#user-content-faq18)
* [(19) ¿Por qué las funcionalidades "pro" son tan caras?](#user-content-faq19)
* [(20) ¿Puedo obtener un reembolso?](#user-content-faq20)
* [(21) ¿Cómo activo la luz de notificaciones?](#user-content-faq21)
* [(22) ¿Qué significa el error cuenta/carpeta?](#user-content-faq22)
* [(23) ¿Por qué recibo una alerta.. ?](#user-content-faq23)
* [(24) ¿Qué es explorar mensajes en el servidor?](#user-content-faq24)
* [(25) ¿Por qué no puedo seleccionar/abrir/guardar una imagen, adjunto o un archivo?](#user-content-faq25)
* [(26) ¿Puedo ayudar a traducir FairEmail a mi propio idioma?](#user-content-faq26)
* [(27) ¿Cómo distingo entre imágenes embebidas y externas?](#user-content-faq27)
* [(28) ¿Cómo puedo administrar las notificaciones de la barra de estado?](#user-content-faq28)
* [(29) ¿Cómo puedo recibir notificaciones de mensajes nuevos para otras carpetas?](#user-content-faq29)
* [(30) ¿Cómo puedo utilizar los ajustes rápidos proporcionados?](#user-content-faq30)
* [(31) ¿Cómo puedo utilizar los atajos proporcionados?](#user-content-faq31)
* [(32) ¿Cómo puedo comprobar si la lectura del correo electrónico es realmente segura?](#user-content-faq32)
* [(33) ¿Por qué no funcionan las direcciones de remitentes editadas?](#user-content-faq33)
* [(34) ¿Cómo coinciden las identidades?](#user-content-faq34)
* [(35) ¿Por qué debo de tener cuidado con ver imágenes, archivos adjuntos y el mensaje original?](#user-content-faq35)
* [(36) ¿Cómo se cifran los archivos de configuración?](#user-content-faq36)
* [(37) ¿Cómo se almacenan las contraseñas?](#user-content-faq37)
* [(39) ¿Cómo puedo reducir el uso de la batería de FairEmail?](#user-content-faq39)
* [(40) ¿Cómo puedo reducir el uso de datos de FairEmail?](#user-content-faq40)
* [(41) ¿Cómo puedo arreglar el error "Handshake falló"?](#user-content-faq41)
* [(42) ¿Puedes añadir un nuevo proveedor a la lista de proveedores?](#user-content-faq42)
* [(43) ¿Puedes mostrar el original ... ?](#user-content-faq43)
* [(44) ¿Puedes mostrar fotos de contacto / identicons en la carpeta enviada?](#user-content-faq44)
* [(45) ¿Cómo puedo arreglar 'Esta clave no está disponible'? Para utilizarlo, ¡debes importarla como una propia!" ?](#user-content-faq45)
* [(46) ¿Por qué la lista de mensajes sigue actualizándose?](#user-content-faq46)
* [(47) ¿Cómo resuelvo el error "No hay cuenta primaria o carpeta de borradores"?](#user-content-faq47)
* [~~(48) ¿Cómo resuelvo el error "No hay cuenta primaria o carpeta de archivo"? ~~](#user-content-faq48)
* [(49) ¿Cómo puedo arreglar 'Una app obsoleta ha enviado la ruta a un archivo en lugar de una secuencia de archivos'?](#user-content-faq49)
* [(50) ¿Puedes añadir una opción para sincronizar todos los mensajes?](#user-content-faq50)
* [(51) ¿Cómo se ordenan las carpetas?](#user-content-faq51)
* [(52) ¿Por qué tomar algún tiempo volver a conectar a una cuenta?](#user-content-faq52)
* [(53) ¿Puedes pegar la barra de acción del mensaje en la parte superior/inferior?](#user-content-faq53)
* [~~(54) ¿Cómo uso un prefijo de espacio de nombres?~~](#user-content-faq54)
* [(55) ¿Cómo puedo marcar todos los mensajes como leídos / moverlos o borrarlos?](#user-content-faq55)
* [(56) ¿Puedes añadir soporte para JMAP?](#user-content-faq56)
* [~~(57) ¿Puedo usar HTML en firmas?~~](#user-content-faq57)
* [(58) ¿Qué significa un icono de correo electrónico abierto/cerrado?](#user-content-faq58)
* [(59) ¿Pueden abrirse mensajes originales en el navegador?](#user-content-faq59)
* [(60) ¿Sabía que ...?](#user-content-faq60)
* [(61) ¿Por qué algunos mensajes se muestran atenuados?](#user-content-faq61)
* [(62) ¿Cuáles métodos de autenticación están soportados?](#user-content-faq62)
* [(63) ¿Cómo se redimensionan las imágenes para mostrarlas en pantalla?](#user-content-faq63)
* [~~(64) ¿Puedes añadir acciones personalizadas para deslizar hacia la izquierda/derecha?~~](#user-content-faq64)
* [(65) ¿Por qué algunos archivos adjuntos se muestran atenuados?](#user-content-faq65)
* [(66) ¿Está FairEmail disponible en la Biblioteca de la Familia de Google Play?](#user-content-faq66)
* [(67) ¿Cómo puedo posponer las conversaciones?](#user-content-faq67)
* [~~(68) ¿Por qué el lector Adobe Acrobat no puede abrir archivos adjuntos PDF / aplicaciones de Microsoft no pueden abrir documentos adjuntos?~~](#user-content-faq68)
* [(69) ¿Puedes añadir desplazamiento automático hasta arriba en un nuevo mensaje?](#user-content-faq69)
* [(70) ¿Cuándo se expandirán automáticamente los mensajes?](#user-content-faq70)
* [(71) ¿Cómo uso las reglas de filtro?](#user-content-faq71)
* [(72) ¿Qué son las cuentas o identidades principales?](#user-content-faq72)
* [(73) ¿Es seguro/eficiente mover mensajes a través de cuentas?](#user-content-faq73)
* [(74) ¿Por qué veo mensajes duplicados?](#user-content-faq74)
* [(75) ¿Puedes hacer una versión para iOS, Windows, Linux, etc?](#user-content-faq75)
* [(76) ¿Qué es lo que 'Limpiar mensajes locales' hace?](#user-content-faq76)
* [(77) ¿Por qué los mensajes a veces se muestran con un pequeño retraso?](#user-content-faq77)
* [(78) ¿Cómo uso horarios?](#user-content-faq78)
* [(79) ¿Cómo uso la sincronización bajo demanda (manual)?](#user-content-faq79)
* [~~(80) ¿Cómo arreglar el error 'Imposible cargar BODYSTRUCTURE'?~~](#user-content-faq80)
* [~~(81) ¿Puedes hacer el fondo del mensaje original oscuro en el tema oscuro?~~](#user-content-faq81)
* [(82) ¿Qué es una imagen de rastreo?](#user-content-faq82)
* [(84) ¿Para qué sirven los contactos locales?](#user-content-faq84)
* [(85) ¿Por qué no está disponible una identidad?](#user-content-faq85)
* [~~(86) ¿Qué son las 'características de privacidad adicionales'?~~](#user-content-faq86)
* [(87) ¿Qué significa 'credenciales no válidas'?](#user-content-faq87)
* [(88) ¿Cómo puedo utilizar una cuenta de Yahoo, AOL o Sky?](#user-content-faq88)
* [(89) ¿Cómo puedo enviar mensajes de sólo texto plano?](#user-content-faq89)
* [(90) ¿Por qué algunos textos están enlazados sin ser un enlace?](#user-content-faq90)
* [~~(91) ¿Puedes añadir sincronización periódica para ahorrar batería?~~](#user-content-faq91)
* [(92) ¿Puede añadir filtro de spam, verificación de la firma DKIM y autorización SPF?](#user-content-faq92)
* [(93) ¿Puede permitir la instalación/almacenamiento de datos en medios de almacenamiento externo (sdcard)?](#user-content-faq93)
* [(94) ¿Qué significa la banda roja/naranja al final de la cabecera?](#user-content-faq94)
* [(95) ¿Por qué no se muestran todas las aplicaciones al seleccionar un archivo adjunto o una imagen?](#user-content-faq95)
* [(96) ¿Dónde puedo encontrar los ajustes IMAP y SMTP?](#user-content-faq96)
* [(97) ¿Qué es la 'limpieza'?](#user-content-faq97)
* [(98) ¿Por qué todavía puedo elegir contactos después de revocar los permisos de los contactos?](#user-content-faq98)
* [(99) ¿Puedes añadir un editor de texto enriquecido o de markdown?](#user-content-faq99)
* [(100) ¿Cómo puedo sincronizar las categorías de Gmail?](#user-content-faq100)
* [(101) ¿Qué significa el punto azul/naranja en la parte inferior de las conversaciones?](#user-content-faq101)
* [(102) ¿Cómo puedo habilitar la rotación automática de imágenes?](#user-content-faq102)
* [(103) ¿Cómo puedo grabar audio?](#user-content-faq103)
* [(104) ¿Qué necesito saber sobre los informes de errores?](#user-content-faq104)
* [(105) ¿Cómo funciona la opción de roam-como-en-casa?](#user-content-faq105)
* [(106) ¿Qué lanzadores pueden mostrar un contador con el número de mensajes no leídos?](#user-content-faq106)
* [(107) ¿Cómo utilizo estrellas de colores?](#user-content-faq107)
* [(108) ¿Puedes añadir eliminar mensajes permanentemente desde cualquier carpeta?](#user-content-faq108)
* [~~(109) ¿Por qué 'seleccionar cuenta' está disponible sólo en versiones oficiales?~~](#user-content-faq109)
* [(110) ¿Por qué hay (algunos) mensajes vacíos y/o adjuntos corruptos?](#user-content-faq110)
* [(111) ¿Es compatible OAuth?](#user-content-faq111)
* [(112) ¿Qué proveedor de correo electrónico recomendas?](#user-content-faq112)
* [(113) ¿Cómo funciona la autenticación biométrica?](#user-content-faq113)
* [(114) ¿Puedes añadir una importación para la configuración de otras aplicaciones de correo electrónico?](#user-content-faq114)
* [(115) ¿Puedes añadir chips de direcciones de correo electrónico?](#user-content-faq115)
* [~~(116) ¿Cómo puedo mostrar imágenes en mensajes de remitentes de confianza por defecto?~~](#user-content-faq116)
* [(117) ¿Puede ayudarme a restaurar mi compra?](#user-content-faq117)
* [(118) ¿Qué es exactamente 'Quitar parámetros de seguimiento'?](#user-content-faq118)
* [~~(119) ¿Puedes añadir colores al widget de bandeja de entrada unificada?~~](#user-content-faq119)
* [(120) ¿Por qué no son eliminadas las notificaciones de nuevos mensajes al abrir la aplicación?](#user-content-faq120)
* [(121) ¿Cómo se agrupan los mensajes en una conversación?](#user-content-faq121)
* [~~(122) ¿Por qué se muestra el nombre/correo-e del destinatario con un color de advertencia?~~](#user-content-faq122)
* [(123) ¿Qué pasará cuando FairEmail no pueda conectarse a un servidor de correo-e?](#user-content-faq123)
* [(124) ¿Por qué recibo 'Mensaje muy grande o muy complejo para mostrar?](#user-content-faq124)
* [(125) ¿Cuáles son las características experimentales actuales?](#user-content-faq125)
* [(126) ¿Pueden enviarse las previsualizaciones de mensajes a mi vestible?](#user-content-faq126)
* [(127) ¿Cómo puedo arreglar 'argumento(s) HELO sintácticamente invalido'?](#user-content-faq127)
* [(128) ¿Cómo puedo reiniciar las preguntas, por ejemplo para mostrar imágenes?](#user-content-faq128)
* [(129) ¿ProtonMail, Tutanota son apoyadas?](#user-content-faq129)
* [(130) ¿Qué significa error de mensaje..?](#user-content-faq130)
* [(131) ¿Puedes cambiar la dirección para deslizar al mensaje previo/siguiente?](#user-content-faq131)
* [(132) ¿Por qué se silencian las notificaciones de mensajes nuevos?](#user-content-faq132)
* [(133) ¿Por qué ActiveSync no es compatible?](#user-content-faq133)
* [(134) ¿Puedes añadir borrado de mensajes locales?](#user-content-faq134)
* [(135) ¿Por qué se muestran mensajes basura y borradores en las conversaciones?](#user-content-faq135)
* [(136) ¿Cómo puedo eliminar una cuenta/identidad/carpeta?](#user-content-faq136)
* [(137) ¿Cómo puedo reiniciar 'No preguntar de nuevo'?](#user-content-faq137)
* [(138) ¿Puedes añadir calendario/gestión de contactos/sincronización?](#user-content-faq138)
* [(139) ¿Cómo arreglo 'El usuario está autenticado pero no conectado'?](#user-content-faq139)
* [(140) ¿Por qué el texto del mensaje contiene caracteres extraños?](#user-content-faq140)
* [(141) ¿Cómo puedo arreglar 'Una carpeta de borradores es necesaria para enviar mensajes'?](#user-content-faq141)
* [(142) ¿Cómo puedo guardar los mensajes enviados en la bandeja de entrada?](#user-content-faq142)
* [~~(143) ¿Puedes añadir una carpeta de papelera para cuentas POP3?~~](#user-content-faq143)
* [(144) ¿Cómo puedo grabar notas de voz?](#user-content-faq144)
* [(145) ¿Cómo puedo establecer un sonido de notificación para una cuenta, carpeta o remitente?](#user-content-faq145)
* [(146) ¿Cómo puedo arreglar tiempos incorrectos de los mensajes?](#user-content-faq146)
* [(147) ¿Qué debo saber sobre las versiones de terceros?](#user-content-faq147)
* [(148) ¿Cómo puedo usar una cuenta iCloud de Apple?](#user-content-faq148)
* [(149) ¿Cómo funciona el widget de conteo de mensajes no leídos?](#user-content-faq149)
* [(150) ¿Puedes añadir la cancelación de invitaciones de calendario?](#user-content-faq150)
* [(151) ¿Puedes añadir copia de seguridad/restauración de mensajes?](#user-content-faq151)
* [(152) ¿Cómo puedo insertar un grupo de contacto?](#user-content-faq152)
* [(153) ¿Por qué la eliminación permanente de mensajes de Gmail no funciona?](#user-content-faq153)
* [~~(154) ¿Puedes añadir favicons como fotos de contacto?~~](#user-content-faq154)
* [(155) ¿Qué es un archivo winmail.dat?](#user-content-faq155)
* [(156) ¿Cómo puedo configurar una cuenta de Office 365?](#user-content-faq156)
* [(157) ¿Cómo puedo configurar una cuenta de Free.fr?](#user-content-faq157)
* [(158) ¿Qué cámara / grabador de audio recomienda?](#user-content-faq158)
* [(159) ¿Qué son las listas de protección de rastreadores de Disconnect?](#user-content-faq159)
* [(160) ¿Puedes añadir el borrado permanente de mensajes sin confirmación?](#user-content-faq160)
* [(161) ¿Puedes añadir un ajuste para cambiar el color principal y de acento?](#user-content-faq161)

[Tengo otra pregunta.](#user-content-support)

<a name="faq1"></a>
**(1) ¿Qué permisos son necesarios y por qué?**

Se necesitan los siguientes permisos de Android:

* *tiene acceso a la red completa* (INTERNET): para enviar y recibir correo electrónico
* *ver conexiones de red* (ACCESS_NETWORK_STATE): para monitorizar los cambios de conectividad a Internet
* *ejecutar al inicio* (RECEIVE_BOOT_COMPLETED): para iniciar la monitorización al iniciar el dispositivo
* *servicio de primer plano* (FOREGROUND_SERVICE): para ejecutar un servicio de primer plano en Android 9 Pie y posterior, ver también la siguiente pregunta
* *evitar que el dispositivo duerme* (WAKE_LOCK): para mantener el dispositivo despierto mientras sincroniza los mensajes
* *facturación in-app* (BILLING): para permitir compras en la app
* Opcional: *lee tus contactos* (READ_CONTACTS): para autocompletar direcciones y para mostrar fotos
* Opcional: *lee el contenido de tu tarjeta SD* (READ_EXTERNAL_STORAGE): para aceptar archivos de otras aplicaciones desactualizadas, consulta también [este FAQ](#user-content-faq49)
* Opcional: *usar hardware de huella dactilar* (USE_FINGERPRINT) y usar *hardware biométrico* (USE_BIOMETRIC): para usar autenticación biométrica
* Opcional: *encontrar cuentas en el dispositivo* (GET_ACCOUNTS) para seleccionar una cuenta cuando se utiliza la configuración rápida de Gmail
* Android 5. Lollipop y antes: *usar cuentas en el dispositivo* (USE_CREDENTIALS): para seleccionar una cuenta al usar la configuración rápida de Gmail (no solicitada en versiones posteriores de Android)
* Android 5. Lollipop y antes: *usar cuentas en el dispositivo* (USE_CREDENTIALS): para seleccionar una cuenta al usar la configuración rápida de Gmail (no solicitada en versiones posteriores de Android)

[Permisos opcionales](https://developer.android.com/training/permissions/requesting) son compatibles con Android 6 Marshmallow y sólo posteriores. En versiones anteriores de Android se le pedirá que conceda los permisos opcionales para instalar FairEmail.

Los siguientes permisos son necesarios para mostrar el recuento de mensajes no leídos como una insignia (ver también [este FAQ](#user-content-faq106)):

* *com.sec.android.provider.badge.permission.READ*
* *com.sec.android.provider.badge.permission.WRITE*
* *com.htc.launcher.permission.READ_SETINGS*
* *com.htc.launcher.permission► PDATE_SHORTCUT*
* *com.sonyericsson.home.permission.BROADCAST_BADGE*
* *com.sonymobile.home.permission.PROVIDER_INSERT_BADGE*
* *com.anddoes.launcher.permisos PDATE_COUNT*
* *com.majeur.launcher.permission► PDATE_BADGE*
* *com.huawei.android.launcher.permission.CHANGE_BADGE*
* *com.huawei.android.launcher.permission.READ_SETTINGS*
* *com.huawei.android.launcher.permission.WRITE_SETTINGS*
* *android.permission.READ_APP_BADGE*
* *com.oppo.launcher.permission.READ_SETINGS*
* *com.oppo.launcher.permission.WRITE_SETINGS*
* *me.everything.badger.permission.BADGE_COUNT_READ*
* *me.everything.badger.permission.BADGE_COUNT_WRITE*

FairEmail mantendrá una lista de direcciones de las que recibe y a las que envía mensajes y utilizará esta lista para sugerencias de contactos cuando no se otorgue permiso de contactos a FairEmail. Esto significa que puede utilizar FairEmail sin el proveedor de contactos Android (libreta de direcciones). Ten en cuenta que todavía puedes elegir contactos sin conceder sus permisos a FairEmail, solo sugerir que los contactos no funcionarán sin los permisos de contactos.

<br />

<a name="faq2"></a>
**(2) ¿Por qué se muestra una notificación permanente?**

Una notificación permanente de baja prioridad con el número de cuentas monitoreadas y el número de operaciones pendientes (ver la siguiente pregunta) se muestra para evitar que Android mate el servicio que se encarga de recibir correo electrónico continuamente. Esto [ya era necesario](https://developer.android.com/reference/android/app/Service.html#startForeground(int,%20android.app.Notification)), pero con la introducción de [modo doze](https://developer.android.com/training/monitoring-device-state/doze-standby) en Android 6 Marshmallow esto es más necesario que nunca. El modo Doze detendrá todas las aplicaciones cuando la pantalla esté apagada por algún tiempo a menos que la aplicación inicie un servicio de primer plano, lo que requiere mostrar una notificación en la barra de estado.

La mayoría, si no todas, otras aplicaciones de correo electrónico no muestran una notificación, con el "efecto secundario" de que los mensajes nuevos a menudo no son reportados o son reportados tarde y que los mensajes no son enviados o son enviados tarde.

Android muestra primero los iconos de las notificaciones de la barra de estado de alta prioridad y ocultará el icono de la notificación de FairEmail si ya no hay espacio para mostrar los iconos. En la práctica esto significa que la notificación de la barra de estado no ocupa espacio en la barra de estado, a menos que haya espacio disponible.

La notificación de la barra de estado se puede desactivar a través de la configuración de notificación de FairEmail:

* Android 8 Oreo y posteriores: toque el botón *Canal de recepción* y desactive el canal a través de la configuración de Android (esto no deshabilitará las notificaciones de nuevos mensajes)
* Android 7 Nougat y antes: habilite *Usa el servicio de segundo plano para sincronizar mensajes*, pero asegúrese de leer el comentario debajo de la configuración

Puede cambiar a sincronización periódica de mensajes en la configuración de recepción para eliminar la notificación, pero tenga en cuenta que esto podría aumentar el uso de batería. Vea [aquí](#user-content-faq39) para más detalles sobre el uso de la batería.

Android 8 Oreo también podría mostrar una notificación de barra de estado con el texto *Las aplicaciones se están ejecutando en segundo plano*. Por favor, consulte [aquí](https://www.reddit.com/r/Android/comments/7vw7l4/psa_turn_off_background_apps_notification/) sobre cómo puede desactivar esta notificación.

Algunas personas sugirieron usar [Firebase Cloud Messaging](https://firebase.google.com/docs/cloud-messaging/) (FCM) en lugar de un servicio Android con una notificación en la barra de estado, pero esto requeriría que los proveedores de correo enviaran mensajes FCM o un servidor central donde todos los mensajes sean recogidos enviando mensajes FCM. La primera no va a suceder y la última tendría importantes implicaciones en materia de privacidad.

Si vino aquí haciendo clic en la notificación, debe saber que el siguiente clic abrirá la bandeja de entrada unificada.

<br />

<a name="faq3"></a>
**(3) ¿Qué son las operaciones y por qué están pendientes?**

La notificación de la barra de estado de baja prioridad muestra el número de operaciones pendientes, que pueden ser:

* *añadir*: añadir mensaje a la carpeta remota
* *mover*: mover mensaje a otra carpeta remota
* *copiar*: copiar mensaje a otra carpeta remota
* *obtener*: obtención de mensajes cambiados (pushed)
* *borrar*: borrar mensaje de la carpeta remota
* *visto*: marcar mensaje como leído/no leído en la carpeta remota
* *respondido*: marca el mensaje como respondido en la carpeta remota
* *marcar*: añadir/remover estrella en la carpeta remota
* *palabra clave*: añadir/eliminar marca IMAP en carpeta remota
* *etiqueta*: establecer/restablecer etiqueta Gmail en carpeta remota
* *encabezados*: descargar encabezados de mensajes
* *raw*: descargar mensaje raw
* *cuerpo*: descargar texto del mensaje
* *adjunto*: descargar adjunto
* *sincronizar*: sincronizar mensajes locales y remotos
* *suscribir*: suscribirse a la carpeta remota
* *purgar*: borrar todos los mensajes de la carpeta remota
* *enviar*: enviar mensaje
* *existe*: comprueba si el mensaje existe
* *regla*: ejecutar regla en el cuerpo del texto

Las operaciones sólo se procesan cuando hay una conexión al servidor de correo electrónico o cuando se sincroniza manualmente. Ver también [estas Preguntas Frecuentes](#user-content-faq16).

<br />

<a name="faq4"></a>
**(4) ¿Cómo puedo utilizar un certificado de seguridad inválido / contraseña vacía / conexión de texto plano?**

*... No confiable ... no en el certificado ...*
<br />
*... Certificado de seguridad inválido (no se puede verificar la identidad del servidor) ...*

Debería intentar arreglar esto poniéndose en contacto con su proveedor u obteniendo un certificado de seguridad válido porque los certificados de seguridad inválidos no son seguros y permiten [ataques man-in-the-middle](https://en.wikipedia.org/wiki/Man-in-the-middle_attack). Si el dinero es un obstáculo, puede obtener certificados de seguridad gratuitos de [Let’s Encrypt](https://letsencrypt.org).

Alternativamente, puede aceptar la huella digital mostrada a continuación del mensaje de error si configura la cuenta y/o identidad en los pasos de configuración 1 y 2 (esto no es posible cuando utiliza el asistente de configuración rápido). Tenga en cuenta que debe asegurarse de que la conexión a Internet que está utilizando es segura.

Tenga en cuenta que las versiones antiguas de Android podrían no reconocer las nuevas autoridades de certificación como Let’s Encrypt que causan que las conexiones se consideren inseguras, vea también [aquí](https://developer.android.com/training/articles/security-ssl).

*Trust anchor for certification path not found*

*... java.security.cert.CertPathValidatorException: Trust anchor for certification path not found ...* significa que el administrador de confianza por defecto de Android no pudo verificar la cadena de certificados del servidor.

Debería reparar la configuración del servidor o aceptar la huella digital mostrada debajo del mensaje de error.

Tenga en cuenta que este problema también puede ser causado por el servidor no enviando todos los certificados intermedios.

*Contraseña vacía*

Su nombre de usuario probablemente sea fácilmente adivinado, por lo que esto es inseguro.

*Conexión de texto simple*

Su nombre de usuario y contraseña y todos los mensajes serán enviados y recibidos sin cifrar, el cual es **muy inseguro** porque un [ataque de intermediario](https://en.wikipedia.org/wiki/Man-in-the-middle_attack) es muy simple en una conexión no cifrada.

Si aún quiere usar un certificado de seguridad invalido, una contraseña vacía o una conexión de texto simple necesitará habilitar conexiones inseguras en la cuenta y/o configuraciones de identidad. STARTTLS debería ser seleccionado para conexiones de texto simple. Si activa conexiones inseguras, sólo debería conectarse a través de redes privadas y confiables y nunca a través de redes públicas, como las ofrecidas en hoteles, aeropuertos, etc.

<br />

<a name="faq5"></a>
**(5) ¿Cómo puedo personalizar la vista del mensaje?**

En el menú de tres puntos puede activar o desactivar o seleccionar:

* *tamaño de texto*: para tres tamaños de fuente diferentes
* *vista compacta*: para elementos de mensaje más condensados y una fuente de texto más pequeña

En la sección de visualización de los ajustes puede activar o desactivar:

* *Bandeja de entrada unificada*: para desactivar la bandeja de entrada unificada y para listar las carpetas seleccionadas para la bandeja de entrada unificada en su lugar
* *Agrupar por fecha*: mostrar el encabezado de fecha sobre los mensajes con la misma fecha
* *Hilos de conversación*: para desactivar la vista de conversación y mostrar mensajes individuales en su lugar
* *Mostrar fotos de contactos*: para ocultar fotos de contactos
* *Mostrar identicons*: para mostrar avatares de contactos generados
* *Mostrar nombres y direcciones de correo electrónico*: mostrar nombres o mostrar nombres y direcciones de correo electrónico
* *Mostrar asunto en cursiva*: para mostrar el asunto del mensaje como texto normal
* *Mostrar estrellas*: para ocultar estrellas (favoritos)
* *Mostrar vista previa del mensaje*: para mostrar dos líneas del texto del mensaje
* *Mostrar detalles de dirección por defecto*: para expandir la sección de direcciones por defecto
* *Usa una fuente monospaciada para el texto del mensaje*: para usar una fuente de ancho fijo para el texto de los mensajes
* *Mostrar automáticamente el mensaje original para los contactos conocidos*: para mostrar automáticamente los mensajes originales para los contactos en su dispositivo, por favor lea [estas Preguntas Frecuentes](#user-content-faq35)
* *Mostrar automáticamente el mensaje original para los contactos conocidos*: para mostrar automáticamente los mensajes originales para los contactos en su dispositivo, por favor lea [estas Preguntas Frecuentes](#user-content-faq35)
* *Barra de acción de conversación*: para desactivar la barra de navegación inferior

Tenga en cuenta que los mensajes sólo se pueden previsualizar cuando se haya descargado el texto del mensaje. Los textos de mensajes más grandes no se descargan por defecto en redes medidas (generalmente móviles). Puedes cambiar esto en la configuración.

Si la lista de direcciones es larga, puede contraer la sección de direcciones con el icono *menos* en la parte superior de la sección de direcciones.

Algunas personas piden:

* mostrar la el asunto en negrita, pero la negrita ya está siendo usada para resaltar los mensajes no leídos
* mostrar la dirección o el asunto más grande/más pequeño, pero esto interferiría con la opción de tamaño de texto
* mover la estrella a la izquierda, pero es mucho más fácil tener la estrella en el lado derecho

Por desgracia, es imposible hacer feliz a todo el mundo y añadir un montón de ajustes no sólo sería confuso, sino que nunca sería suficiente.

<br />

<a name="faq6"></a>
**(6) ¿Cómo puedo iniciar sesión en Gmail / G suite?**

Puede utilizar el asistente de configuración rápida para configurar fácilmente una cuenta e identidad de Gmail.

Si no quiere usar una cuenta Gmail del dispositivo, puede habilitar el acceso para "aplicaciones menos seguras" y utilizar la contraseña de su cuenta (no recomendado) o habilitar la autenticación de dos factores y utilizar una contraseña específica de la aplicación. Para utilizar una contraseña necesitará configurar una cuenta e identidad a través del paso de configuración 1 y 2 en lugar del asistente de configuración rápida.

Consulte [estas Preguntas Frecuentes](#user-content-faq111) sobre por qué sólo se pueden utilizar las cuentas en el dispositivo.

Tenga en cuenta que se requiere una contraseña específica de la aplicación cuando la autenticación de dos factores está habilitada.

<br />

*Contraseña específica de la aplicación*

Vea [aquí](https://support.google.com/accounts/answer/185833) sobre cómo generar una contraseña específica de la aplicación.

<br />

*Habilitar "Aplicaciones menos seguras"*

**Importante**: no se recomienda usar este método porque es menos confiable.

**Importante**: Las cuentas de Gsuite autorizadas con un nombre de usuario/contraseña dejarán de funcionar [en un futuro próximo](https://gsuiteupdates.googleblog.com/2019/12/less-secure-apps-oauth-google-username-password-incorrect.html).

Vea [aquí](https://support.google.com/accounts/answer/6010255) acerca de cómo habilitar "aplicaciones menos seguras" o vaya [directamente a la configuración](https://www.google.com/settings/security/lesssecureapps).

Si usa múltiples cuentas de Gmail, asegúrese de cambiar la configuración de "aplicaciones menos seguras" de la(s) cuenta(s) correcta(s).

Tenga en cuenta que necesita salir de la pantalla de ajustes de "aplicaciones menos seguras" usando la flecha hacia atrás para aplicar la configuración.

Si usa este método, debería usar una [contraseña fuerte](https://en.wikipedia.org/wiki/Password_strength) para tu cuenta de Gmail, lo cual es una buena idea de todos modos. Tenga en cuenta que usar el protocolo IMAP [estándar](https://tools.ietf.org/html/rfc3501) en sí mismo no es menos seguro.

Cuando "aplicaciones menos seguras" no está activado, obtendrá el error *La autenticación falló - credenciales inválidas* para cuentas (IMAP) y *Nombre de usuario y contraseña no aceptados* para identidades (SMTP).

<br />

*General*

Puede obtener la alerta "*Inicie sesión a través de su navegador web*". Esto sucede cuando Google considera que la red que lo conecta a Internet (esto podría ser una VPN) es insegura. Esto se puede evitar usando el asistente de configuración rápida de Gmail o una contraseña específica de la aplicación.

Mire [aquí](https://support.google.com/mail/answer/7126229) las instrucciones de Google y [aquí](https://support.google.com/mail/accounts/answer/78754) para solucionar problemas.

<br />

<a name="faq7"></a>
**(7) ¿Por qué los mensajes enviados no aparecen (directamente) en la carpeta enviados?**

Los mensajes enviados normalmente se mueven de la bandeja de salida a la carpeta enviados tan pronto como su proveedor agrega los mensajes enviados a la carpeta enviados. Esto requiere que se seleccione una carpeta enviados en la configuración de la cuenta y que la carpeta enviados se configure para sincronizar.

Algunos proveedores no llevan un seguimiento de los mensajes enviados o el servidor SMTP usado podría no estar relacionado con el proveedor. En estos casos FairEmail automáticamente añadirá mensajes enviados a la carpeta enviados al sincronizar la carpeta enviados, que sucederá después de que se haya enviado un mensaje. Tenga en cuenta que esto resultará en tráfico extra de Internet.

~~Si esto no sucede, es posible que su proveedor no esté al tanto de los mensajes enviados o que esté utilizando un servidor SMTP no relacionado con el proveedor. ~ ~~En estos casos puede habilitar la configuración avanzada de identidad *Guardar mensajes enviados* para que FairEmail añada mensajes enviados a la carpeta enviados justo después de enviar un mensaje. ~ ~~Tenga en cuenta que habilitar esta configuración puede resultar en mensajes duplicados si su proveedor añade mensajes enviados a la carpeta enviados. ~ ~~Además tenga cuidado de que habilitar esta configuración dará como resultado un uso adicional de datos, especialmente cuando se envíen mensajes con grandes archivos adjuntos.~~

~~Si los mensajes enviados en la bandeja de salida no se encuentran en la carpeta enviados en una sincronización completa, también se moverán de la bandeja de salida a la carpeta enviados. ~ ~~Una sincronización completa ocurre al reconectar al servidor o al sincronizar periódicamente o manualmente. ~ ~~Probablemente querrá habilitar la configuración avanzada *Almacenar mensajes enviados* en su lugar para mover mensajes a la carpeta enviados más pronto.~~

<br />

<a name="faq8"></a>
**(8) ¿Puedo usar una cuenta de Microsoft Exchange?**

Puede utilizar una cuenta de Microsoft Exchange si es accesible a través de IMAP, lo que es usualmente el caso. Vea [aquí](https://support.office.com/en-us/article/what-is-a-microsoft-exchange-account-47f000aa-c2bf-48ac-9bc2-83e5c6036793) para más información.

Por favor consulte [aquí](https://support.office.com/en-us/article/pop-imap-and-smtp-settings-for-outlook-com-d088b986-291d-42b8-9564-9c414e2aa040) la documentación de Microsoft acerca de la configuración de un cliente de correo electrónico. También hay una sección sobre errores de conexión comunes y soluciones.

Algunas versiones antiguas del servidor Exchange tienen un error que causa mensajes vacíos y adjuntos corruptos. Consulte [esta sección de Preguntas Frecuentes](#user-content-faq110) para una solución provisional.

Consulte [esta sección de Preguntas Frecuentes](#user-content-faq133) sobre el soporte de ActiveSync.

Consulte [esta sección de Preguntas Frecuentes](#user-content-faq111) sobre el soporte de OAuth.

<br />

<a name="faq9"></a>
**(9) ¿Qué son las identidades / cómo añadir un alias?**

Las identidades representan las direcciones de correo electrónico *desde* las que está enviando a través de un servidor de correo electrónico (SMTP).

Algunos proveedores le permiten tener múltiples alias. Puede configurarlos estableciendo el campo de dirección de correo electrónico de una identidad adicional a la dirección de alias y configurando el campo nombre de usuario a su dirección de correo electrónico principal.

Tenga en cuenta que puede copiar una identidad manteniéndola presionada.

Alternativamente, puede habilitar *Permitir editar la dirección del remitente* en la configuración avanzada de una identidad existente para editar el nombre de usuario cuando se compone un nuevo mensaje, si su proveedor lo permite.

FairEmail actualizará automáticamente las contraseñas de las identidades relacionadas cuando actualice la contraseña de la cuenta asociada o una identidad relacionada.

Vea [estas Preguntas Frecuentes](#user-content-faq33) sobre la edición del nombre de usuario de las direcciones de correo electrónico.

<br />

<a name="faq10"></a>
**~~(10) ¿Qué significa 'UIDPLUS no soportado'?~~**

~~El mensaje de error *UIDPLUS no soportado* significa que su proveedor de correo no proporciona la extensión IMAP [UIDPLUS](https://tools.ietf.org/html/rfc4315). Esta extensión IMAP es necesaria para implementar la sincronización de dos vías, que no es una característica opcional. Así que, a menos que su proveedor pueda habilitar esta extensión, no puede usar FairEmail para este proveedor.~~

<br />

<a name="faq11"></a>
**~~(11) ¿Por qué no se admite POP?~~**

~~Además de que cualquier proveedor de correo electrónico decente soporta [IMAP](https://en.wikipedia.org/wiki/Internet_Message_Access_Protocol) estos días,~~ ~~usar [POP](https://en.wikipedia.org/wiki/Post_Office_Protocol) dará como resultado un uso adicional innecesario de la batería y un retraso en las notificaciones de nuevos mensajes.~~ ~~Además, POP es inadecuado para la sincronización de dos vías y la mayoría de las veces la gente lee y escribe mensajes en diferentes dispositivos hoy en día.~~

~~Básicamente, POP sólo soporta descargar y borrar mensajes de la bandeja de entrada.~~ ~~Entonces, las operaciones comunes como configurar los atributos del mensaje (leer, marcar, responder, etc.), añadir (respaldar) y mover mensajes no es posible.~~

~~Ver también [lo que Google escribe sobre eso](https://support.google.com/mail/answer/7104828).~~

~~Por ejemplo [Gmail puede importar mensajes](https://support.google.com/mail/answer/21289) desde otra cuenta POP,~~ ~~que puede ser usado como solución temporal para cuando su proveedor no soporta IMAP.~~

~~tl;dr; considere cambiar a IMAP.~~

<br />

<a name="faq12"></a>
**(12) ¿Cómo funciona el cifrado/descifrado?**

*General*

Por favor, [vea aquí](https://en.wikipedia.org/wiki/Public-key_cryptography) sobre cómo funciona el cifrado con clave pública/privada.

Cifrado en resumen:

* Los mensajes **salientes** se cifran con la **clave pública** del destinatario
* Los mensajes **entrantes** se descifran con la **clave privada** del destinatario

Firma en resumen:

* Los mensajes **salientes** se firman con la **clave privada** del remitente
* Los mensajes **entrantes** se verifican con la **clave pública** del remitente

Para firmar/cifrar un mensaje, simplemente seleccione el método apropiado en el diálogo de enviar. También puede abrir el diálogo de enviar usando el menú de tres puntos en caso de que haya seleccionado *No volver a mostrar* antes.

Para verificar una firma o descifrar un mensaje recibido, abra el mensaje y pulse el icono de gesto o candado justo debajo de la barra de acción del mensaje.

La primera vez que envíe un mensaje firmado/cifrado puede que le pidan una clave de firma. FairEmail almacenará automáticamente la clave de firma seleccionada en la identidad utilizada para la próxima vez. Si necesita restablecer la clave de firma, simplemente guarde la identidad o mantenga pulsada la identidad en la lista de identidades y seleccione *Restablecer clave de firma*. La clave de firma seleccionada es visible en la lista de identidades. Si es necesario seleccionar una clave caso por caso puede crear múltiples identidades para la misma cuenta con la misma dirección de correo electrónico.

En la configuración de privacidad puede seleccionar el método de cifrado predeterminado (PGP o S/MIME), active *Firmar por defecto*, *Cifrar por defecto* y *Descifrar mensajes automáticamente*, pero tenga en cuenta que el descifrado automático no es posible si la interacción del usuario es requerida, como seleccionar una clave o leer un token de seguridad.

El texto/adjuntos a cifrar y el texto/adjunto descifrados se almacenan localmente sólo y nunca se añadirán al servidor remoto. Si quiere deshacer el descifrado, puedes usar el elemento de menú *Resincronizar* en el menú de tres puntos de la barra de acción del mensaje.

*PGP*

Necesitará instalar y configurar [OpenKeychain](https://f-droid.org/en/packages/org.sufficientlysecure.keychain/) primero. FairEmail ha sido probado con OpenKeychain versión 5.4. Es muy probable que las versiones posteriores sean compatibles, pero las versiones anteriores podrían no serlo.

**Importante**: la aplicación OpenKeychain es conocida por (silenciosamente) cerrarse cuando la aplicación que llama (FairEmail) no está autorizada aún y está recibiendo una clave pública existente. Puede solucionar esto intentando enviar un mensaje firmado/cifrado a un remitente con una clave pública desconocida.

**Importante**: si la aplicación OpenKeychain (ya) no puede encontrar una clave, puede que deba restablecer una clave previamente seleccionada. Esto se puede hacer manteniendo presionada una identidad en la lista de identidades (Configuración, paso 2, Administrar).

**Importante**: para permitir que aplicaciones como FairEmail se conecten de forma confiable al servicio OpenKeychain para cifrar/descifrar mensajes, podría ser necesario desactivar las optimizaciones de batería para la aplicación OpenKeychain.

**Importante**: la aplicación OpenKeychain necesita el permiso de contactos para funcionar correctamente.

**Importante**: en algunas versiones / dispositivos Android es necesario habilitar *Mostrar ventanas emergentes mientras se ejecuta en segundo plano* en los permisos adicionales de la configuración de la aplicación Android de la aplicación OpenKeychain. Sin este permiso el borrador será guardado, pero la ventana emergente de OpenKeychain para confirmar/seleccionar podría no aparecer.

FairEmail enviará el encabezado [Autocrypt](https://autocrypt.org/) para su uso por otros clientes de correo electrónico, pero sólo para mensajes firmados y cifrados porque demasiados servidores de correo tienen problemas con el a menudo largo encabezado Autocrypt. Tenga en cuenta que la forma más segura de iniciar un intercambio de correo electrónico cifrado es enviando mensajes firmados primero. Los encabezados Autocrypt recibidos serán enviados a la aplicación OpenKeychain para su almacenamiento al verificar una firma o descifrar un mensaje.

Toda la gestión de claves se delega a la aplicación OpenKeychain por razones de seguridad. Esto también significa que FairEmail no almacena claves PGP.

Se admite cifrado PGP en línea en los mensajes recibidos, pero las firmas PGP en línea y PGP en línea en los mensajes salientes no son soportados, mire [aquí](https://josefsson.org/inline-openpgp-considered-harmful.html) sobre por qué no.

Los mensajes sólo firmados o sólo cifrados no son una buena idea, por favor vea aquí por qué no:

* [Consideraciones sobre OpenPGP Parte I](https://k9mail.github.io/2016/11/24/OpenPGP-Considerations-Part-I.html)
* [Consideraciones sobre OpenPGP Parte II](https://k9mail.github.io/2017/01/30/OpenPGP-Considerations-Part-II.html)
* [Consideraciones sobre OpenPGP Parte III Autocrypt](https://k9mail.github.io/2018/02/26/OpenPGP-Considerations-Part-III-Autocrypt.html)

Se admiten mensajes sólo firmados, los mensajes sólo cifrados no están soportados.

Errores comunes:

* *Sin clave*: no hay ninguna clave PGP disponible para una de las direcciones de correo electrónico listadas
* *Falta la clave para el cifrado*: probablemente hay una clave seleccionada en FairEmail que ya no existe en la aplicación OpenKeychain. Restablecer la clave (ver arriba) probablemente solucione este problema.

*S/MIME*

Cifrar un mensaje requiere la(s) clave(s) pública(s) del destinatario(s). Firmar un mensaje requiere su clave privada.

Las claves privadas son almacenadas por Android y se pueden importar a través de la configuración de seguridad avanzada de Android. Hay un acceso directo (botón) para esto en la configuración de privacidad. Android le pedirá que establezca un PIN, patrón o contraseña si no lo ha hecho antes. Si tiene un dispositivo Nokia con Android 9, por favor [lea esto primero](https://nokiamob.net/2019/08/10/a-bug-prevents-nokia-1-owners-from-unlocking-their-screen-even-with-right-pin-pattern/).

Tenga en cuenta que los certificados pueden contener múltiples claves para múltiples propósitos, por ejemplo para la autenticación, el cifrado y la firma. Android sólo importa la primera clave, así que para importar todas las claves, el certificado primero debe ser dividido. Esto no es muy trivial y se le aconseja que pida ayuda al proveedor del certificado.

Nótese que la firma S/MIME  con otros algoritmos que RSA es soportada, pero tenga en cuenta que otros clientes de correo electrónico tal vez no lo soporten. El cifrado S/MIME es posible únicamente con algoritmos simétricos, lo que significa que en la práctica se utiliza RSA.

El método de cifrado por defecto es PGP, pero el último método de cifrado utilizado será recordado para la identidad seleccionada para la próxima vez. Puede que necesite activar las opciones de envío en el menú de tres puntos de nuevo para poder seleccionar el método de cifrado.

Para permitir diferentes claves privadas para la misma dirección de correo electrónico, FairEmail siempre le permitirá seleccionar una clave cuando haya múltiples identidades con la misma dirección de correo electrónico para la misma cuenta.

Las claves públicas son almacenadas por FairEmail y pueden ser importadas al verificar una firma por primera vez o a través de la configuración de privacidad (formatos PEM o DER).

FairEmail verifica tanto la firma como la cadena completa de certificados.

Errores comunes:

* *No se ha encontrado ningún certificado que coincida con targetContraints*: esto seguramente significa que está usando una versión antigua de FairEmail
* *incapaz de encontrar una ruta de certificación válida para el objetivo solicitado*: básicamente esto significa que uno o más certificados intermedios o raíz no fueron encontrados
* *La clave privada no coincide con ninguna clave de cifrado*: la clave seleccionada no puede utilizarse para descifrar el mensaje, probablemente porque es la clave incorrecta
* *No hay clave privada*: no se ha seleccionado ningún certificado o no hay ningún certificado disponible en el almacén de claves Android

En caso de que la cadena de certificados sea incorrecta, puede pulsar el pequeño botón de información para mostrar todos los certificados. Después de los detalles del certificado se muestra el emisor o "auto-Firmado". Un certificado es auto-Firmado cuando el sujeto y el emisor son los mismos. Los certificados de una autoridad certificadora (CA) están marcados con "[keyCertSign](https://tools.ietf.org/html/rfc5280#section-4.2.1.3)". Los certificados encontrados en el almacén de claves Android están marcados con "Android".

Una cadena válida se ve así:

```
Su certificado > cero o más certificados intermedios > CA (raíz) certificado marcado con "Android"
```

Tenga en cuenta que una cadena de certificados siempre será inválida cuando no se pueda encontrar ningún certificado raíz en el almacén de claves Android, que es fundamental para la validación del certificado S/MIME.

Consulte [aquí](https://support.google.com/pixelphone/answer/2844832?hl=en) cómo puede importar certificados en la tienda de claves Android.

El uso de claves caducadas, mensajes cifrados/firmados en línea y tokens de seguridad de hardware no está soportado.

Si está buscando un certificado S/MIME gratuito (de prueba), consulta [aquí](http://kb.mozillazine.org/Getting_an_SMIME_certificate) para ver las opciones. Por favor, asegúrese de [leer esto antes](https://davidroessli.com/logs/2019/09/free-smime-certificates-in-2019/#update20191219) si desea solicitar un certificado de S/MIME Actalis. If you are looking for a cheap S/MIME certificate, I had a good experience with [Certum](https://www.certum.eu/en/smime-certificates/).

Cómo extraer una clave pública de un certificado S/MIME:

```
openssl pkcs12 -in filename.pfx/p12 -clcerts -nokeys -out cert.pem
```

Puedes decodificar firmas S/MIME, etc, [aquí](https://lapo.it/asn1js/).

La firma/cifrado S/MIME es una característica pro, pero todas las demás operaciones PGP y S/MIME son gratis para usar.

<br />

<a name="faq13"></a>
**(13) ¿Cómo funciona la búsqueda en dispositivo/servidor?**

Puede empezar a buscar mensajes en el remitente (de), destinatario (a, cc, cco), asunto, palabras clave o texto de mensaje mediante el uso de la lupa en la barra de acción de una carpeta. También puede buscar desde cualquier aplicación seleccionando *Buscar correo electrónico* en el menú emergente.

Buscar en la bandeja de entrada unificada buscará en todas las carpetas de todas las cuentas, buscar en la lista de carpetas sólo buscará en la cuenta asociada y buscar en una carpeta sólo buscará en esa carpeta.

Los mensajes se buscarán primero en el dispositivo. Habrá un botón de acción con un icono de buscar de nuevo en la parte inferior para continuar la búsqueda en el servidor. Puede seleccionar en qué carpeta continuar la búsqueda.

El protocolo IMAP no permite buscar en más de una carpeta al mismo tiempo. Buscar en el servidor es una operación costosa, por lo tanto no es posible seleccionar múltiples carpetas.

La búsqueda de mensajes locales no distingue mayúsulas/minúsculas y es sobre texto parcial. El texto del mensaje de los mensajes locales no se buscará si el texto del mensaje no se ha descargado todavía. Buscar en el servidor puede ser sensible a mayúsculas o minúsculas y puede estar en texto parcial o palabras enteras, dependiendo del proveedor.

Algunos servidores no pueden manejar la búsqueda en el texto del mensaje cuando hay un gran número de mensajes. Para este caso hay una opción para desactivar la búsqueda en el texto del mensaje.

Es posible usar operadores de búsqueda de Gmail prefijando un comando de búsqueda con *raw:*. Si ha configurado sólo una cuenta de Gmail, puede iniciar una búsqueda directa directamente en el servidor buscando desde la bandeja de entrada unificada. Si configuró varias cuentas de Gmail, primero tendrá que navegar a la lista de carpetas o a la carpeta de archivos (todos los mensajes) de la cuenta de Gmail en la que quiere buscar. Por favor, [vea aquí](https://support.google.com/mail/answer/7190) para los posibles operadores de búsqueda. Por ejemplo:

`
raw:larger:10M`

Buscar a través de un gran número de mensajes en el dispositivo no es muy rápido debido a dos limitaciones:

* [sqlite](https://www.sqlite.org/), el motor de base de datos de Android tiene un límite de tamaño de registro, evitando que los mensajes de texto se almacenen en la base de datos
* Las aplicaciones Android tienen memoria limitada para trabajar, incluso si el dispositivo tiene suficiente memoria disponible

Esto significa que la búsqueda de un texto de mensaje requiere que los archivos que contengan los textos del mensaje deban abrirse uno por uno para comprobar si el texto buscado está contenido en el archivo, que es un proceso relativamente costoso.

En la *configuración miscelánea* puede habilitar *Construir índice de búsqueda* para aumentar significativamente la velocidad de búsqueda en el dispositivo, pero tenga en cuenta que esto aumentará el uso de la batería y el espacio de almacenamiento. El índice de búsqueda se basa en palabras, por lo que no es posible buscar texto parcial. Buscar usando el índice de búsqueda es por defecto Y, así que buscar *manzana naranja* buscará manzana Y naranja. Las palabras separadas por comas resultan en la búsqueda de OR, así que por ejemplo *manzana, naranja* buscará manzana O naranja. Ambos se pueden combinar, así que buscar *manzana, naranja banana* buscará manzana O (naranja Y banana). Usar el índice de búsqueda es una característica pro.

Desde la versión 1.1315 es posible utilizar expresiones de búsqueda como esta:

```
manzana +banana -cereza ?nueces
```

Esto resultará en buscar de esta manera:

```
("manzana" Y "banana" Y NO "cereza") O "nueces"
```

Las expresiones de búsqueda pueden utilizarse para buscar en el dispositivo a través del índice de búsqueda y para buscar en el servidor de correo electrónico, pero no para buscar en el dispositivo sin índice de búsqueda por razones de rendimiento.

Buscar en el dispositivo es una característica gratuita, usar el índice de búsqueda y la búsqueda en el servidor es una característica pro.

<br />

<a name="faq14"></a>
**(14) ¿Cómo puedo configurar una cuenta de Outlook / Live / Hotmail?**

Se puede configurar una cuenta de Outlook / Live / Hotmail a través del asistente de configuración rápida y seleccionando *Outlook*.

Para utilizar una cuenta de Outlook, Live o Hotmail con autenticación de dos factores activada, necesita crear una contraseña de la aplicación. Vea [aquí](https://support.microsoft.com/en-us/help/12409/microsoft-account-app-passwords-two-step-verification) para más detalles.

Vea [aquí](https://support.office.com/en-us/article/pop-imap-and-smtp-settings-for-outlook-com-d088b986-291d-42b8-9564-9c414e2aa040) para las instrucciones de Microsoft.

Para configurar una cuenta de Office 365, consulte [esta sección de Preguntas Frecuentes](#user-content-faq156).

<br />

<a name="faq15"></a>
**(15) ¿Por qué sigue cargando el texto del mensaje?**

El encabezado del mensaje y el cuerpo del mensaje se obtienen por separado del servidor. El texto del mensaje de los mensajes más grandes no está siendo pre-obtenido en conexiones medidas y necesita ser obtenido bajo demanda al abrir el mensaje. El texto del mensaje seguirá cargándose si no hay conexión con la cuenta, vea también la siguiente pregunta, o si hay otras operaciones, como mensajes sincronizando, se están ejecutando.

Puede comprobar la lista de cuentas y carpetas para el estado de las cuentas y las carpetas (ver la leyenda para el significado de los iconos) y la lista de operaciones accesible a través del menú de navegación principal para operaciones pendientes (ver [estas Preguntas Frecuentes](#user-content-faq3) para el significado de las operaciones).

Si FairEmail se está retrasando debido a problemas de conectividad previos, por favor vea [esta sección de Preguntas Frecuentes](#user-content-faq123), puede forzar la sincronización a través del menú de tres puntos.

En la configuración de recepción puede establecer el tamaño máximo para la descarga automática de mensajes en conexiones medidas.

Las conexiones móviles son casi siempre medidas y algunos puntos de acceso Wi-Fi (de pago) también lo son.

<br />

<a name="faq16"></a>
**(16) ¿Por qué no se sincronizan los mensajes?**

Las posibles causas de que los mensajes no sean sincronizados (enviados o recibidos) son:

* La cuenta o carpeta(s) no están configuradas para sincronizar
* El número de días para sincronizar mensajes es demasiado bajo
* No hay conexión a Internet utilizable
* El servidor de correo electrónico no está disponible temporalmente
* Android detuvo el servicio de sincronización

Por lo tanto, compruebe la configuración de su cuenta y carpetas y compruebe si las cuentas/carpetas están conectadas (vea la leyenda en el menú de navegación para ver el significado de los iconos).

Si hay algún mensaje de error, por favor consulte [éstas Preguntas Frecuentes](#user-content-faq22).

En algunos dispositivos, donde hay muchas aplicaciones que compiten por la memoria, Android puede detener el servicio de sincronización como último recurso.

Algunas versiones de Android detienen aplicaciones y servicios en forma demasiado agresiva. Vea [este sitio web dedicado](https://dontkillmyapp.com/) y [este problema de Android](https://issuetracker.google.com/issues/122098785) para más información.

Deshabilitar las optimizaciones de batería (paso 4 de la configuración) reduce la posibilidad de que Android detenga el servicio de sincronización.

<br />

<a name="faq17"></a>
**~~(17) ¿Por qué no funciona la sincronización manual?~~**

~~Si el menú *Sincronizar ahora* está atenuado, no hay conexión con la cuenta.~~

~~Vea la pregunta anterior para más información.~~

<br />

<a name="faq18"></a>
**(18) ¿Por qué no siempre se muestra la vista previa del mensaje?**

La vista previa del texto del mensaje no se puede mostrar si el cuerpo del mensaje no ha sido descargado todavía. Vea también [estas Preguntas Frecuentes](#user-content-faq15).

<br />

<a name="faq19"></a>
**(19) ¿Por qué las características Pro son tan caras?**

La pregunta correcta es "*¿por qué hay tantos impuestos y tasas?*":

* IVA: 25 % (dependiendo de su país)
* Comisión de Google: 30 %
* Impuesto sobre la renta: 50 %
* <sub>Comisión de Paypal: 5-10 % dependiendo del país/monto</sub>

Por lo tanto, lo que queda para el desarrollador es sólo una fracción de lo que usted paga.

Tenga en cuenta que sólo algunas características avanzadas y de comodidad necesitan ser compradas, lo que significa que FairEmail es básicamente gratis de usar.

También tenga en cuenta que la mayoría de las aplicaciones gratuitas parecerán no ser sostenibles al final, mientras que FairEmail está correctamente mantenido y con soporte, y que las aplicaciones gratuitas pueden tener una trampa, como enviar información confidencial privada a Internet.

He estado trabajando en FairEmail casi todos los días por más de dos años, por lo que creo que el precio es más que razonable. Por esta razón tampoco habrá descuentos.

<br />

<a name="faq20"></a>
**(20) ¿Puedo obtener un reembolso?**

Si una característica Pro comprada no funciona como está previsto y esto no es causado por un problema en las características gratuitas y no puedo arreglar el problema de forma oportuna, usted puede obtener un reembolso. En todos los demás casos no es posible el reembolso. En ninguna circunstancia hay un reembolso posible para cualquier problema relacionado con las características gratuitas, ya que no se les pagó nada y porque pueden ser evaluadas sin ninguna limitación. Asumo mi responsabilidad como vendedor de entregar lo que se ha prometido y espero que usted se responsabilice de informarse de lo que está comprando.

<a name="faq21"></a>
**(21) ¿Cómo puedo activar la luz de notificación?**

Antes de Android 8 Oreo: hay una opción avanzada en la configuración para esto.

Android 8 Oreo y posteriores: vea [aquí](https://developer.android.com/training/notify-user/channels) sobre cómo configurar los canales de notificación. Puede utilizar el botón *Administrar notificaciones* en la configuración para ir directamente a los ajustes de notificación de Android. Tenga en cuenta que las aplicaciones no pueden cambiar los ajustes de notificación, incluyendo la configuración de la luz de notificación, en Android 8 Oreo y posteriores. Las aplicaciones diseñadas y orientadas a versiones antiguas de Android podrían seguir siendo capaces de controlar el contenido de las notificaciones, pero estas aplicaciones ya no se pueden actualizar y las versiones recientes de Android mostrarán una advertencia de que dichas aplicaciones están desactualizadas.

A veces es necesario deshabilitar la configuración *Mostrar vista previa del mensaje en notificaciones* o habilitar la configuración *Mostrar notificaciones sólo con un texto de vista previa* para solucionar un error en Android. Esto podría aplicarse también a los sonidos y vibración de notificaciones.

Establecer un color de luz antes de Android 8 no es compatible y no es posible en Android 8 y posteriores.

<br />

<a name="faq22"></a>
**(22) ¿Qué significa el error de cuenta/carpeta?**

FairEmail no oculta errores como aplicaciones similares a menudo lo hacen, por lo que es más fácil diagnosticar problemas.

FairEmail intentará reconectarse automáticamente después de un retraso. Este retraso se duplicará tras cada intento fallido de evitar que se agote la batería y que se bloquee permanentemente el acceso.

Hay errores generales y errores específicos para las cuentas de Gmail (ver abajo).

**Errores generales**

El error *... La autenticación falló ...* o *... AUTHENTICATE falló...* probablemente significa que su nombre de usuario o contraseña era incorrecto. Algunos proveedores esperan como nombre de usuario sólo *nombre de usuario* y otros tu dirección de correo electrónico completa *usuario@ejemplo.com*. Al copiar/pegar para introducir un nombre de usuario o contraseña, pueden copiarse caracteres invisibles, lo que también podría causar este problema. También se sabe que algunos administradores de contraseñas hacen esto incorrectamente. El nombre de usuario puede ser sensible a mayúsculas, así que intente sólo caracteres en minúsculas. La contraseña es casi siempre sensible a mayúsculas y minúsculas. Algunos proveedores requieren usar una contraseña de aplicación en lugar de la contraseña de la cuenta, así que por favor revise la documentación del proveedor. A veces es necesario habilitar primero el acceso externo (IMAP/SMTP) en el sitio web del proveedor. Otras posibles causas son que la cuenta está bloqueada o que el inicio de sesión ha sido restringido administrativamente de alguna manera, por ejemplo permitiendo iniciar sesión desde ciertas redes / direcciones IP solamente.

El error *... Demasiados intentos de autenticación incorrectos ...* probablemente significa que está utilizando una contraseña de cuenta de Yahoo en lugar de una contraseña de la aplicación. Por favor, consulte [estas Preguntas Frecuentes](#user-content-faq88) sobre cómo configurar una cuenta Yahoo.

El mensaje *... +OK ...* probablemente significa que un puerto POP3 (normalmente el número de puerto 995) está siendo usado para una cuenta IMAP (normalmente el puerto número 993).

Los errores *... saludo inválido ...*, *... requiere una dirección válida ...* y *... Parámetro HELO no se ajusta a la sintaxis RFC ...* puede resolverse cambiando la configuración de identidad avanzada *Utilice la dirección IP local en lugar del nombre de host*.

Los errores *... No se pudo conectar al host ...*, *... Conexión rechazada...* o *... Red inalcanzable ...* significa que FairEmail no pudo conectarse al servidor de correo.

El error *... Host no resuelto ...* o "*... No se puede resolver el host ...* significa que la dirección del servidor de correo no se ha podido resolver. Esto puede ser causado por el bloqueo de anuncios o por un servidor [DNS](https://en.wikipedia.org/wiki/Domain_Name_System) inaccesible o que no funciona correctamente.

El error *... Software causó fin de conexión ...* significa que el servidor de correo o algo entre FairEmail y el servidor de correo terminó activamente una conexión existente. Esto puede suceder, por ejemplo, cuando la conectividad se perdió abruptamente. Un ejemplo típico es activar el modo vuelo.

Los errores *... BYE Cerrando sesión...*, *... Conexión restablecida por el par ...* significa que el servidor de correo ha terminado activamente una conexión existente.

El error *... Conexión cerrada por el par ...* podría ser causada por un servidor de Exchange no actualizado, vea [aquí](https://blogs.technet.microsoft.com/pki/2010/09/30/sha2-and-windows/) para más información.

Los errores *... Error de lectura ...*, *... Error de escritura ...*, *... Tiempo de lectura agotado ...*, *... Conexión rota...* significa que el servidor de correo electrónico ya no responde o que la conexión a internet es mala.

El error *... Fin inesperado de flujo de entrada zlib ...* significa que no todos los datos fueron recibidos, posiblemente debido a una conexión incorrecta o interrumpida.

El error *... fallo de conexión ...* podría indicar [Demasiadas conexiones simultáneas](#user-content-faq23).

La advertencia *... Codificación no soportada...* significa que el conjunto de caracteres del mensaje es desconocido o no soportado. FairEmail asumirá ISO-8859-1 (Latin1), que en la mayoría de los casos resultará en mostrar el mensaje correctamente.

Por favor, [vea aquí](#user-content-faq4) para los errores *... No confiable ... no en el certificado ...*, *... Certificado de seguridad no válido (no se puede verificar la identidad del servidor) ...* o *... Trust anchor for certification path not found ...*

Por favor, [vea aquí](#user-content-faq127) para el error *... Argumento(s) HELO sintácticamente inválido(s) ...*.

Por favor, [vea aquí](#user-content-faq41) para el error *... Handshake falló ...*.

Vea [aquí](https://linux.die.net/man/3/connect) para saber qué significan los códigos de error como EHOSTUNREACH y ETIMEDOUT.

Las causas posibles son:

* Un cortafuegos o router está bloqueando conexiones al servidor
* El nombre de host o número de puerto no es válido
* Hay problemas con la conexión a internet
* Hay problemas con la resolución de nombres de dominio (Yandex: intente desactivar DNS privado en la configuración de Android)
* El servidor de correo electrónico se niega a aceptar conexiones (externas)
* El servidor de correo electrónico se niega a aceptar un mensaje, por ejemplo porque es demasiado grande o contiene enlaces inaceptables
* Hay demasiadas conexiones al servidor, vea también la siguiente pregunta

Muchas redes Wi-Fi públicas bloquean el correo electrónico saliente para prevenir el spam. A veces puede solucionar esto usando otro puerto SMTP. Consulte la documentación del proveedor para ver los números de puerto utilizables.

Si está usando una [VPN](https://en.wikipedia.org/wiki/Virtual_private_network), el proveedor de VPN puede bloquear la conexión porque está intentando prevenir el spam de forma demasiado agresiva. Tenga en cuenta que [Google Fi](https://fi.google.com/) también está usando una VPN.

**Enviar errores**

Los servidores SMTP pueden rechazar los mensajes por [varias razones](https://en.wikipedia.org/wiki/List_of_SMTP_server_return_codes). Los mensajes demasiado grandes y el filtro de correo no deseado de un servidor de correo electrónico son las razones más comunes.

* El límite de tamaño del archivo adjunto para Gmail [es de 25 MB](https://support.google.com/mail/answer/6584)
* El límite de tamaño de archivo adjunto para Outlook y Office 365 [es de 20 MB](https://support.microsoft.com/en-us/help/2813269/attachment-size-exceeds-the-allowable-limit-error-when-you-add-a-large)
* El límite de tamaño del archivo adjunto para Yahoo [es de 25 MB](https://help.yahoo.com/kb/SLN5673.html)
* *554 5.7.1 Servicio no disponible; Host cliente xxxx.xx.xx.xxx bloqueado*, por favor [vea aquí](https://docs.gandi.net/en/gandimail/faq/error_types/554_5_7_1_service_unavailable.html)
* *501 Error de sintaxis - línea demasiado larga* es a menudo causada por el uso de un encabezado Autocrypt largo
* *503 5.5.0 Destinatario ya especificado* significa principalmente que una dirección está siendo utilizada como dirección A y CC

**Error de Gmail**

La autorización de las cuentas de Gmail configuradas con el asistente rápido debe actualizarse periódicamente a través del [administrador de cuentas de Android](https://developer.android.com/reference/android/accounts/AccountManager). Esto requiere permisos de contactos/cuenta y conectividad a Internet.

El error *... La autenticación falló... Cuenta no encontrada ...* significa que una cuenta de Gmail previamente autorizada fue eliminada del dispositivo.

Los errores *... La autenticación falló ... Ningún token al actualizar...* significa que el administrador de cuentas de Android falló al actualizar la autorización de una cuenta de Gmail.

El error *... La autenticación falló ... Credenciales inválidas... error de red...* significa que el administrador de cuentas de Android no pudo actualizar la autorización de una cuenta de Gmail debido a problemas con la conexión a Internet

El error *... La autenticación falló ... Credenciales inválidas ...* podría ser causado por haber revocado los permisos requeridos de cuenta/contactos. Simplemente inicie el asistente (pero no seleccione una cuenta) para conceder los permisos necesarios de nuevo.

El error *... ServiceDisabled...* puede ser causado por inscribirse en el [Programa de Protección Avanzada](https://landing.google.com/advancedprotection/): "*Para leer su correo electrónico, puede (debe) usar Gmail - No podrá usar su cuenta de Google con algunas (todas) aplicaciones & servicios que requieren acceso a datos sensibles como tus correos electrónicos*", vea [aquí](https://support.google.com/accounts/answer/7519408?hl=en&ref_topic=9264881).

En caso de duda, puede solicitar [soporte](#user-content-support).

<br />

<a name="faq23"></a>
**(23) ¿Por qué me alerta ... ?**

*General*

Las alertas son mensajes de advertencia enviados por los servidores de correo electrónico.

*Demasiadas conexiones simultáneas* o *Número máximo de conexiones excedido*

Esta alerta se enviará cuando haya demasiadas conexiones de carpetas para la misma cuenta de correo electrónico al mismo tiempo.

Las causas posibles son:

* Hay varios clientes de correo electrónico conectados a la misma cuenta
* El mismo cliente de correo está conectado varias veces a la misma cuenta
* Las conexiones anteriores terminaron abruptamente, por ejemplo, al perder abruptamente la conectividad a Internet

Primero trate de esperar algún tiempo para ver si el problema se resuelve por sí mismo, de lo contrario:

* cambie a comprobar periódicamente los mensajes en la configuración de recepción, lo que dará como resultado abrir carpetas una a la vez
* o configure algunas carpetas para sondear en lugar de sincronizar (mantenga presioanda una carpeta de la lista de carpetas, editar propiedades)

El número máximo de conexiones de carpetas simultáneas para Gmail es 15, para que pueda sincronizar como máximo 15 carpetas simultáneamente en *todos* sus dispositivos al mismo tiempo. Por esta razón, las carpetas de *usuario* de Gmail están configuradas para sondear por defecto en lugar de sincronizar siempre. Cuando sea necesario o deseado, puede cambiar esto manteniendo presionada una carpeta en la lista de carpetas y seleccionando *Editar propiedades*. Vea [aquí](https://support.google.com/mail/answer/7126229) para más detalles.

Al usar un servidor Dovecot, puede que quiera cambiar la configuración [mail_max_userip_connections](https://doc.dovecot.org/settings/dovecot_core_settings/#mail-max-userip-connections).

<br />

<a name="faq24"></a>
**(24) ¿Qué son los mensajes de exploración en el servidor?**

Explorar mensajes en el servidor obtendrá los mensajes del servidor de correo en tiempo real cuando llegue al final de la lista de mensajes sincronizados, incluso cuando la carpeta está configurada para no sincronizar. Puede desactivar esta función en la configuración avanzada de la cuenta.

<br />

<a name="faq25"></a>
**(25) ¿Por qué no puedo seleccionar/abrir/guardar una imagen, adjunto o archivo?**

Cuando un elemento de menú para seleccionar/abrir/guardar un archivo está deshabilitado (atenuado) o cuando recibe el mensaje *El framework de acceso al almacenamiento no está disponible*, el [framework de acceso al almacenamiento](https://developer.android.com/guide/topics/providers/document-provider), un componente estándar de Android, probablemente no esté presente. Esto puede deberse a que su ROM personalizada no la incluye o porque fue removida activamente (debloated).

FairEmail no solicita permisos de almacenamiento, por lo que este framework es necesario para seleccionar archivos y carpetas. Ninguna aplicación, excepto tal vez gestores de archivos, dirigidos a Android 4.4 KitKat o posterior debería pedir permisos de almacenamiento porque permitiría el acceso a *todos los* archivos.

El framework de acceso al almacenamiento es proporcionado por el paquete *com.android.documentsui*, que es visible como la aplicación *Archivos* en algunas versiones de Android (notable en OxygenOS).

Puede habilitar (nuevamente) el framework de acceso al almacenamiento con este comando adb:

```
pm install -k --user 0 com.android.documentsui
```

Alternativamente, puede habilitar la aplicación *Archivos* de nuevo usando la configuración de aplicaiones de Android.

<br />

<a name="faq26"></a>
**(26) ¿Puedo ayudar a traducir FairEmail en mi propio idioma?**

Sí, puede traducir los textos de FairEmail a su propio idioma [en Crowdin](https://crowdin.com/project/open-source-email). El registro es gratuito.

Si desea que su nombre o alias sea incluido en la lista de colaboradores en *Acerca de* la aplicación, por favor [póngase en contacto conmigo](https://contact.faircode.eu/?product=fairemailsupport).

<br />

<a name="faq27"></a>
**(27) ¿Cómo puedo distinguir entre imágenes incrustadas y externas?**

Imagen externa:

![Imagen externa](https://github.com/M66B/FairEmail/blob/master/images/baseline_image_black_48dp.png)

Imagen incrustada:

![Imagen incrustada](https://github.com/M66B/FairEmail/blob/master/images/baseline_photo_library_black_48dp.png)

Imagen rota:

![Imagen rota](https://github.com/M66B/FairEmail/blob/master/images/baseline_broken_image_black_48dp.png)

Tenga en cuenta que la descarga de imágenes externas desde un servidor remoto puede ser usada para registrar que sí vio un mensaje, lo que probablemente no quiera si el mensaje es spam o malicioso.

<br />

<a name="faq28"></a>
**(28) ¿Cómo puedo administrar las notificaciones de la barra de estado?**

En la configuración encontrarás un botón *Administrar notificaciones* para navegar directamente a la configuración de notificaciones de Android para FairEmail.

En Android 8 Oreo y posteriores puede administrar las propiedades de los canales de notificación individuales, por ejemplo para establecer un sonido de notificación específico o para mostrar notificaciones en la pantalla de bloqueo.

FairEmail tiene los siguientes canales de notificación:

* Servicio: usado para la notificación del servicio de sincronización, vea también [éstas Preguntas Frecuentes](#user-content-faq2)
* Enviar: usado para la notificación del servicio de envío
* Notificaciones: usado para notificaciones de mensajes nuevos
* Alertas: usado para notificaciones de advertencia
* Errores: usado para notificaciones de error

Vea [aquí](https://developer.android.com/guide/topics/ui/notifiers/notifications#ManageChannels) para más detalles sobre los canales de notificación. Resumiendo: toque el nombre del canal de notificación para acceder a la configuración del canal.

En Android antes de Android 8 Oreo puede configurar el sonido de notificación en los ajustes.

Vea [estas de Preguntas Frecuentes](#user-content-faq21) si su dispositivo tiene una luz de notificación.

<br />

<a name="faq29"></a>
**(29) ¿Cómo puedo recibir notificaciones de mensajes nuevos para otras carpetas?**

Sólo mantenga presionada una carpeta, seleccione *Editar propiedades*, y habilite *Mostrar en bandeja de entrada unificada* o *Notificar mensajes nuevos* (disponible en Android 7 Nougat y posteriores solamente) y toque *Guardar*.

<br />

<a name="faq30"></a>
**(30) ¿Cómo puedo usar los ajustes rápidos proporcionados?**

Hay ajustes rápidos (botones de ajustes rápidos) disponibles para:

* activar/desactivar la sincronización globalmente
* mostrar el número de mensajes nuevos y marcarlos como vistos (no leídos)

Los ajustes rápidos requieren Android 7.0 Nougat o posterior. El uso de mosaicos de configuración se explica [aquí](https://support.google.com/android/answer/9083864).

<br />

<a name="faq31"></a>
**(31) ¿Cómo puedo utilizar los accesos rápidos proporcionados?**

Hay accesos rápidos disponibles para:

* redactar un nuevo mensaje a un contacto favorito
* configurar cuentas, identidades, etc

Los accesos directos requieren Android 7.1 Nougat o posterior. El uso de accesos rápidos se explica [aquí](https://support.google.com/android/answer/2781850).

<br />

<a name="faq32"></a>
**(32) ¿Cómo puedo comprobar si la lectura del correo electrónico es realmente segura?**

Puede utilizar [Email Privacy Tester](https://www.emailprivacytester.com/) para esto.

<br />

<a name="faq33"></a>
**(33) ¿Por qué no funcionan las direcciones del remitente editadas?**

La mayoría de los proveedores sólo aceptan direcciones validadas cuando envían mensajes para prevenir el spam.

Por ejemplo, Google modifica los encabezados de mensajes como éste para direcciones *no verificadas*:

```
De: Alguien <somebody@example.org>
X-Google-Original-From: Alguien <somebody+extra@example.org>
```

Esto significa que la dirección del remitente editada fue automáticamente reemplazada por una dirección verificada antes de enviar el mensaje.

Tenga en cuenta que esto es independiente de recibir mensajes.

<br />

<a name="faq34"></a>
**(34) ¿Cómo se emparejan las identidades?**

Como es esperable, las identidades se emparejan por cuenta. Para mensajes entrantes las direcciones *a*, *cc*, *cco*, *de* y *(X-)entregado/sobre/original-a* serán comprobadas(en este orden) y para mensajes salientes (borradores, bandeja de salida y enviados) solo se comprobarán las direcciones de *de*.

La dirección coincidente se mostrará como *vía* en la sección de direcciones de los mensajes recibidos (entre el encabezado del mensaje y el texto del mensaje).

Tenga en cuenta que las identidades deben estar habilitadas para poder ser emparejadas y que las identidades de otras cuentas no serán consideradas.

La coincidencia sólo se hará una vez al recibir un mensaje, por lo que cambiar la configuración no cambiará los mensajes existentes. Sin embargo, puede borrar los mensajes locales manteniendo presionada una carpeta en la lista de carpetas y sincronizando los mensajes de nuevo.

Es posible configurar una [expresión regular](https://en.wikipedia.org/wiki/Regular_expression) en la configuración de identidad para que coincida con el nombre de usuario de una dirección de correo electrónico (la última parte antes del signo @).

Tenga en cuenta que el nombre de dominio (la parte después del signo @) siempre debe ser igual al nombre de dominio de la identidad.

Si desea emparejar una dirección de correo electrónico comodín, ésta expresión regular está mayormente bien:

```
.*
```

Si desea emparejar con las direcciones de correo electrónico de propósito especial abc@ejemplo.com y xyx@ejemplo. om y le gusta tener una dirección de correo electrónico de respaldo main@ejemplo.com también, podría hacer algo así:

* Identidad: abc@ejemplo.com; regex: **(?i)abc**
* Identidad: xyz@ejemplo.com; regex: **(?i)xyz**
* Identidad: main@ejemplo.com; regex: **^(?i)((?!abc|xyz).)\*$**

Las identidades coincidentes se pueden utilizar para colorear los mensajes. El color de identidad tiene prioridad sobre el color de la cuenta. Establecer colores de identidad es una característica pro.

<br />

<a name="faq35"></a>
**(35) ¿Por qué debo tener cuidado con ver imágenes, archivos adjuntos y el mensaje original?**

Ver imágenes almacenadas de forma remota (vea también [estas Preguntas Frecuentes](#user-content-faq27)) podría no solo decirle al remitente que ha visto el mensaje, pero también filtrará su dirección IP.

Abrir archivos adjuntos o ver un mensaje original podría cargar contenido remoto y ejecutar scripts, que no sólo puede causar fugas de información confidencial sobre privacidad, sino que también puede ser un riesgo para la seguridad.

Tenga en cuenta que sus contactos podrían enviar sin saberlo mensajes maliciosos si se infectan con malware.

FairEmail formatea mensajes nuevamente causando que los mensajes se vean diferentes de los originales, pero también descubriendo enlaces de phishing.

Tenga en cuenta que los mensajes reformateados son a menudo más legibles que los mensajes originales porque los márgenes se eliminan, y los colores y tamaños de las fuentes se estandarizan.

La aplicación de Gmail muestra imágenes por defecto al descargar las imágenes a través de un servidor proxy de Google. Dado que las imágenes se descargan desde el servidor de origen [en tiempo real](https://blog.filippo.io/how-the-new-gmail-image-proxy-works-and-what-this-means-for-you/), esto es aún menos seguro porque Google también está implicado sin proporcionar muchos beneficios.

Puede mostrar imágenes y mensajes originales por defecto para los remitentes de confianza en cada caso marcando *No volver a preguntar esto para ...*.

Si desea restablecer las aplicaciones para *Abrir con*, por favor [vea aquí](https://www.androidauthority.com/how-to-set-default-apps-android-clear-621269/).

<br />

<a name="faq36"></a>
**(36) ¿Cómo se cifran los archivos de configuración?**

Versión corta: AES 256 bit

Versión larga:

* La clave de 256 bits se genera con *PBKDF2WithHmacSHA1* usando un salt aleatorio segura de 128 bits y 65536 iteraciones
* El cifrado es *AES/CBC/PKCS5Padding*

<br />

<a name="faq37"></a>
**(37) ¿Cómo se almacenan las contraseñas?**

Todas las versiones de Android compatibles [cifran todos los datos de usuario](https://source.android.com/security/encryption), así que todos los datos, incluyendo nombres de usuario, contraseñas, mensajes, etc, se almacenan cifrados.

Si el dispositivo está protegido con un PIN, patrón o contraseña, puede hacer que las contraseñas de cuenta e identidad sean visibles. Si esto es un problema porque está compartiendo el dispositivo con otras personas, considere usar [perfiles de usuario](https://www.howtogeek.com/333484/how-to-set-up-multiple-user-profiles-on-android/).

<br />

<a name="faq39"></a>
**(39) ¿Cómo puedo reducir el uso de la batería de FairEmail?**

Versiones recientes de Android reportan por defecto *uso de aplicaciones* como porcentaje en la pantalla de configuración de batería de Android. **Confusamente, *uso de la aplicación* no es lo mismo que *uso de la batería* y ¡ni siquiera está directamente relacionado con el uso de la batería!** El uso de la aplicación (mientras está en uso) será muy alto porque FairEmail está utilizando un servicio en primer plano que es considerado como uso constante de aplicaciones por Android. Sin embargo, esto no significa que FairEmail esté usando constantemente energía de batería. El uso real de la batería se puede ver en esta pantalla:

*Configuración de Android*, *Batería*, menú de tres puntos *Uso de batería*, menú de tres puntos *Mostrar uso completo del dispositivo*

Como norma general, el uso de la batería debería estar por debajo o, en cualquier caso, no ser mucho más alto que *Red móvil en espera*. Si este no es el caso, por favor hágamelo saber.

Es inevitable que los sincronizar mensajes use energía de batería porque requiere acceso a la red y acceso a la base de datos de mensajes.

Si está comparando el uso de la batería de FairEmail con otro cliente de correo electrónico, por favor asegúrese de que el otro cliente de correo esté configurado de forma similar. Por ejemplo, comparar sincronizar siempre (mensajes push) y la comprobación periódica (poco frecuente) de nuevos mensajes no es una comparación justa.

Reconectar a un servidor de correo electrónico consumirá energía extra de la batería, por lo que una conexión a internet inestable resultará en un uso adicional de la batería. En este caso puede que quiera sincronizar periódicamente, por ejemplo cada hora, en lugar de continuamente. Tenga en cuenta que sondear con frecuencia (más de 30-60 minutos) probablemente usará más energía de batería que sincronizar siempre porque conectarse al servidor y comparar los mensajes locales y remotos son operaciones costosas.

[En algunos dispositivos](https://dontkillmyapp.com/) es necesario *desactivar* optimizaciones de batería (configuración paso 4) para mantener las conexiones a los servidores de correo electrónico abiertos.

La mayor parte del uso de la batería, sin considerar la visualización de mensajes, se debe a la sincronización (recepción y envío) de mensajes. Por lo tanto, para reducir el uso de la batería, establezca el número de días para sincronizar el mensaje para un valor más bajo. especialmente si hay muchos mensajes recientes en una carpeta. Mantenga presionado un nombre de carpeta en la lista de carpetas y seleccione *Editar propiedades* para acceder a esta configuración.

Si tiene conexión a internet al menos una vez al día, es suficiente para sincronizar los mensajes sólo por un día.

Tenga en cuenta que puede establecer el número de días para *mantener* mensajes a un número mayor que para *sincronizar* mensajes. Por ejemplo, puede sincronizar los mensajes inicialmente para un gran número de días y después de que esto se haya completado reducir el número de días para sincronizar mensajes, pero dejar el número de días para guardar los mensajes.

En los ajustes de recepción puede habilitar para sincronizar siempre los mensajes destacados, lo que le permitirá mantener mensajes antiguos mientras sincroniza mensajes durante un número limitado de días.

Desactivar la opción de carpeta *Descargar automáticamente los mensajes y archivos adjuntos* dará como resultado menos tráfico de red y, por tanto, menos consumo de batería. Puede desactivar esta opción, por ejemplo, para la carpeta enviados y archivo.

Sincronizar mensajes por la noche no es mayormente útil, por lo que puede ahorrar en el uso de la batería si no se sincroniza por la noche. En los ajustes puede seleccionar una agenda para la sincronización de mensajes (esta es una característica Pro).

FairEmail sincronizará por defecto la lista de carpetas en cada conexión. Ya que las carpetas no son creadas, renombradas y eliminadas a menudo, puede ahorrar algo de uso de la red y la batería desactivando esto en los ajustes de recepción.

FairEmail verificará por defecto si los mensajes antiguos fueron borrados del servidor en cada conexión. Si no le importa que los mensajes antiguos que fueron borrados del servidor sigan siendo visibles en FairEmail, puede ahorrar algo de uso de la red y la batería desactivando esto en los ajustes de recepción.

Algunos proveedores no siguen el estándar IMAP y no mantienen las conexiones abiertas lo suficiente, lo que obliga a FairEmail a reconectarse a menudo, causando un uso adicional de la batería. Puede inspeccionar el *Registro* a través del menú de navegación principal para comprobar si hay conexiones frecuentes (conexión cerrada/restablecer, leer/escribir error/timeout, etc). Puede solucionar esto bajando el intervalo de keep-alive en la configuración avanzada de la cuenta, por ejemplo a 9 o 15 minutos. Tenga en cuenta que las optimizaciones de la batería necesitan ser desactivadas en el paso 4 de configuración para mantener vivas las conexiones.

Algunos proveedores envían cada dos minutos algo como '*Todavía aquí*' dando como resultado que el tráfico de red y el dispositivo se desperten y causen un uso adicional de la batería innecesario. Puede inspeccionar el *Registro* a través del menú de navegación principal para comprobar si su proveedor está haciendo esto. Si su proveedor está usando [Dovecot](https://www.dovecot.org/) como servidor IMAP, podría pedir a su proveedor que cambie la configuración [imap_idle_notify_interval](https://wiki.dovecot.org/Timeouts) a un valor mayor o mejor aún, deshabilitar esto. Si su proveedor no es capaz o no está dispuesto a cambiar/deshabilitar esto, debería considerar cambiar a sincronizar periódicamente en lugar de continuamente. Puede cambiar esto en la configuración de recepción.

Si recibió el mensaje *Este proveedor no soporta mensajes push* mientras configura una cuenta, considere cambiar a un proveedor moderno que soporte mensajes push (IMAP IDLE) para reducir el uso de la batería.

Si su dispositivo tiene una pantalla [AMOLED](https://en.wikipedia.org/wiki/AMOLED), puede ahorrar batería mientras ve mensajes cambiando al tema negro.

Si la optimización automática en la configuración de recepción está activada, una cuenta se cambiará automáticamente a comprobar periódicamente si hay nuevos mensajes cuando el servidor de correo electrónico:

* Dice '*Todavía aquí*' dentro de 3 minutos
* El servidor de correo no soporta mensajes push
* El intervalo de keep-alive es inferior a 12 minutos

Además, las carpetas papelera y spam se establecerán automáticamente para comprobar si hay nuevos mensajes después de tres errores sucesivos de [demasiadas conexiones simultáneas](#user-content-faq23).

<br />

<a name="faq40"></a>
**(40) ¿Cómo puedo reducir el uso de datos de FairEmail?**

Puede reducir el uso de datos básicamente de la misma manera que reducir el uso de la batería, vea la pregunta anterior para sugerencias.

Es inevitable que los datos se utilicen para sincronizar mensajes.

Si se pierde la conexión con el servidor de correo electrónico, FairEmail siempre sincronizará los mensajes de nuevo para asegurarse de que no haya mensajes omitidos. Si la conexión es inestable, esto puede resultar en un uso adicional de datos. En este caso, es una buena idea reducir el número de días para sincronizar los mensajes al mínimo (ver la pregunta anterior) o cambiar a sincronización periódica de los mensajes (ajustes de recepción).

Por defecto, FairEmail no descarga mensajes de texto y archivos adjuntos mayores de 256 KiB cuando hay una conexión a internet medida (móvil o Wi-Fi de pago). Puedes cambiar esto en los ajustes de conexión.

<br />

<a name="faq41"></a>
**(41) ¿Cómo puedo corregir el error 'Handshake falló' ?**

Hay varias causas posibles, así que por favor lea hasta el final de esta respuesta.

El error '*Handshake falló ... WRONG_VERSION_NUMBER ...*' puede significar que está intentando conectarse a un servidor IMAP o SMTP sin una conexión cifrada, típicamente usando el puerto 143 (IMAP) y el puerto 25 (SMTP), o que se está utilizando un protocolo equivocado (SSL/TLS o STARTTLS).

La mayoría de los proveedores proporcionan conexiones cifradas usando diferentes puertos, normalmente el puerto 993 (IMAP) y el puerto 465/587 (SMTP).

Si su proveedor no soporta conexiones cifradas, debería solicitar que lo haga posible. Si esto no es una opción, puede habilitar *Permitir conexiones insecuras* en la configuración avanzada Y en la de cuenta/identidad.

Vea también [estas Preguntas Frecuentes](#user-content-faq4).

El error '*Handshake falló ... SLV3_ALERT_ILEGAL_PARAMETER ...*' es causado por un error en la implementación del protocolo SSL o por una clave DH demasiado corta en el servidor de correo electrónico y lamentablemente no puede ser arreglado por FairEmail.

El error '*Handshake falló ... HANDSHAKE_FAILURE_ON_CLIENT_HELLO ...*' puede ser causado por el proveedor que todavía utiliza RC4, que ya no está soportado desde [Android 7](https://developer.android.com/about/versions/nougat/android-7.0-changes.html#tls-ssl).

El error '*Handshake falló ... UNSUPPORTED_PROTOCOL o TLSV1_ALERT_PROTOCOL_VERSION ...*' puede ser causado por la activación de conexiones endurecidas en la configuración de conexión o por Android que ya no soporta protocolos antiguos, como SSLv3.

Android 8 Oreo y posteriores [ya no soportan](https://developer.android.com/about/versions/oreo/android-8.0-changes#security-all) SSLv3. No hay manera de solucionar problemas por falta RC4 y SSLv3 porque se ha eliminado completamente de Android (que debería decir algo).

Puede utilizar [este sitio web](https://ssl-tools.net/mailservers) o [este sitio web](https://www.immuniweb.com/ssl/) para comprobar los problemas de SSL/TLS de los servidores de correo electrónico.

<br />

<a name="faq42"></a>
**(42) ¿Puedes añadir un nuevo proveedor a la lista de proveedores?**

Si el proveedor es utilizado por más que unas pocas personas, sí, con gusto.

Se necesita la siguiente información:

```
<provider
    name="Gmail"
    link="https://support.google.com/mail/answer/7126229" // link to the instructions of the provider
    type="com.google"> // esto no es necesario
    <imap
        host="imap.gmail.com"
        port="993"
        starttls="false" />
    <smtp
        host="smtp.gmail.com"
        port="465"
        starttls="false" />
</provider>
```

El EFF [escribe](https://www.eff.org/nl/deeplinks/2018/06/announcing-starttls-everywhere-securing-hop-hop-email-delivery): "*Adicionalmente, incluso si configura STARTTLS perfectamente y utiliza un certificado válido, todavía no hay garantía de que su comunicación sea cifrada.*"

Por lo tanto, las conexiones SSL puras son más seguras que usar [STARTTLS](https://en.wikipedia.org/wiki/Opportunistic_TLS) y por lo tanto preferidas.

Por favor, asegúrese de que recibir y enviar mensajes funciona correctamente antes de contactarme para agregar un proveedor.

Vea abajo sobre cómo contactarme.

<br />

<a name="faq43"></a>
**(43) ¿Puedes mostrar el original ... ?**

Mostrar original, muestra el mensaje original como el remitente lo ha enviado, incluyendo fuentes originales, colores, márgenes, etc. FairEmail lo hace y no modificará esto de ninguna manera, excepto para solicitar [TEXT_AUTOSIZING](https://developer.android.com/reference/android/webkit/WebSettings.LayoutAlgorithm), que *intentará* hacer el texto pequeño más legible.

<br />

<a name="faq44"></a>
**~~(44) ¿Puedes mostrar fotos de contacto / identiconos en la carpeta enviados?~~**

~~Fotos de contactos e identicons siempre se muestran para el remitente porque esto es necesario para los hilos de conversación.~~ ~~Obtener fotos de contacto para el remitente y el receptor no es realmente una opción porque obtener fotos de contacto es una operación costosa.~~

<br />

<a name="faq45"></a>
**(45) ¿Cómo puedo arreglar 'Esta clave no está disponible. Para utilizarla, ¡debes importarla como una propia!' ?**

Recibirá el mensaje *Esta clave no está disponible. Para usarla ¡debes importarla como una propia!* al intentar descifrar un mensaje con una clave pública. Para arreglar esto necesitará importar la clave privada.

<br />

<a name="faq46"></a>
**(46) ¿Por qué la lista de mensajes sigue actualizándose?**

Si ve un icono 'girando' en la parte superior de la lista de mensajes, la carpeta todavía está siendo sincronizada con el servidor remoto. Puede ver el progreso de la sincronización en la lista de carpetas. Vea la leyenda sobre lo que significan los iconos y números.

La velocidad de su dispositivo y conexión a internet y el número de días para sincronizar los mensajes determinarán cuánto tiempo tardará la sincronización. Tenga en cuenta que no debería establecer el número de días para sincronizar mensajes a más de un día en la mayoría de los casos, vea también [estas Preguntas Frecuentes](#user-content-faq39).

<br />

<a name="faq47"></a>
**(47) ¿Cómo puedo resolver el error 'No hay cuenta principal o no hay carpeta de borradores'?**

Recibirá el mensaje de error *No hay una cuenta principal o No hay carpeta de borradores* al intentar redactar un mensaje mientras no haya una cuenta establecida para ser la cuenta principal o cuando no haya ninguna carpeta de borradores seleccionada para la cuenta principal. Esto puede suceder, por ejemplo, cuando inicias FairEmail para redactar un mensaje desde otra aplicación. FairEmail necesita saber dónde almacenar el borrador, por lo que necesitará seleccionar una cuenta para ser la cuenta principal y/o tendrá que seleccionar una carpeta de borradores para la cuenta principal.

Esto también puede suceder cuando intenta responder a un mensaje o reenviar un mensaje desde una cuenta sin carpeta de borradores mientras no haya una cuenta principal o cuando la cuenta principal no tiene una carpeta de borradores.

Consulte [estas Preguntas Frecuentes](#user-content-faq141) para obtener más información.

<br />

<a name="faq48"></a>
**~~(48) ¿Cómo puedo resolver el error 'No hay cuenta principal o no hay carpeta de archivo' ?~~**

~~Obtendrás el mensaje de error *No hay cuenta principal o no hay carpeta de archivo* al buscar mensajes desde otra aplicación. FairEmail necesita saber dónde buscar, así que tendrá que seleccionar una cuenta para ser la cuenta principal y/o tendrás que seleccionar una carpeta de archivo para la cuenta principal.~~

<br />

<a name="faq49"></a>
**(49) ¿Cómo arreglar 'Una aplicación desactualizada envió una ruta de archivo en lugar de una secuencia de archivos'?**

Probablemente haya seleccionado o enviado un archivo adjunto o una imagen con un administrador de archivos desactualizado o una aplicación desactualizada que asume que todas las aplicaciones todavía tienen permisos de almacenamiento. Por razones de seguridad y privacidad, las aplicaciones modernas como FairEmail ya no tienen acceso completo a todos los archivos. Esto puede resultar en el mensaje de error *Una aplicación desactualizada envió una ruta de archivo en lugar de un flujo de archivo* si un nombre de archivo en lugar de un flujo de archivo está siendo compartido con FairEmail porque FairEmail no puede abrir archivos al azar.

Puede arreglar esto cambiando a un gestor de archivos actualizado o a una aplicación diseñada para versiones recientes de Android. Alternativamente, puede conceder acceso de lectura de FairEmail al espacio de almacenamiento en su dispositivo en la configuración de la aplicación de Android. Tenga en cuenta que esta solución provisional [ya no funcionará en Android Q](https://developer.android.com/preview/privacy/scoped-storage).

Vea también [la pregunta 25](#user-content-faq25) y [lo que Google escribe sobre eso](https://developer.android.com/training/secure-file-sharing/share-file#RespondToRequest).

<br />

<a name="faq50"></a>
**(50) ¿Puedes añadir una opción para sincronizar todos los mensajes?**

No se añadirá la opción sincronizar todos los mensajes (descargae todos) porque puede resultar fácilmente en errores de memoria y en el llenado del espacio de almacenamiento disponible. También puede resultar fácilmente en mucho uso de batería y datos. Los dispositivos móviles no son muy aptos para descargar y almacenar años de mensajes. Puede utilizar mejor la búsqueda en la función del servidor (ver [pregunta 13](#user-content-faq13)), que es más rápida y eficiente. Tenga en cuenta que buscar a través de un montón de mensajes almacenados localmente sólo retrasaría la búsqueda y usaría energía adicional de la batería.

<br />

<a name="faq51"></a>
**(51) ¿Cómo se ordenan las carpetas?**

Las carpetas se ordenan primero por orden de cuenta (por defecto en nombre de la cuenta) y dentro de una cuenta, con un sistema especial, carpetas del sistema en la parte superior, seguidos de carpetas configuradas para sincronizar. Dentro de cada categoría las carpetas se ordenan por nombre a mostrar. Puede establecer el nombre a mostrar manteniendo presionada una carpeta en la lista de carpetas y seleccionando *Editar propiedades*.

El elemento del menú de navegación (hamburguesa) *Ordenar carpetas* en la configuración pueden utilizarse para ordenar manualmente las carpetas.

<br />

<a name="faq52"></a>
**(52) ¿Por qué toma algún tiempo volver a conectar a una cuenta?**

No hay una manera confiable de saber si una conexión a una cuenta fue terminada de forma correcta o forzada. Intentar volver a conectar con una cuenta mientras la conexión de la cuenta se terminó forzadamente con demasiada frecuencia puede resultar en problemas como [demasiadas conexiones simultáneas](#user-content-faq23) o incluso la cuenta siendo bloqueada. Para prevenir estos problemas, FairEmail espera 90 segundos para intentar volver a conectarse.

Puede mantener pulsado *Configuración* en el menú de navegación para volver a conectar inmediatamente.

<br />

<a name="faq53"></a>
**(53) ¿Puedes pegar la barra de acción del mensaje en la parte superior/inferior?**

La barra de acción de mensajes funciona en un solo mensaje y la barra de acción inferior funciona en todos los mensajes de la conversación. Puesto que a menudo hay más de un mensaje en una conversación, esto no es posible. Por otra parte, hay bastantes acciones concretas de mensajes, como por ejemplo reenviar.

Mover la barra de acción del mensaje hacia la parte inferior del mensaje no es atractivo visualmente porque ya hay una barra de acción de conversación en la parte inferior de la pantalla.

Tenga en cuenta que no hay muchas aplicaciones de correo electrónico, si las hay, que muestren una conversación como una lista de mensajes expandibles. Esto tiene muchas ventajas, pero también causa la necesidad de acciones específicas del mensaje.

<br />

<a name="faq54"></a>
**~~(54) ¿Cómo uso un prefijo de espacio de nombres?~~**

~~Un prefijo de espacio de nombres se utiliza para eliminar automáticamente los prefijos que a veces añaden los proveedores a los nombres de carpetas.~~

~~Por ejemplo la carpeta de spam de Gmail es llamada:~~

```
[Gmail]/Spam
```

~~Al establecer el prefijo del espacio de nombres a *[Gmail]* FairEmail automáticamente eliminará *[Gmail]/* de todos los nombres de carpetas.~~

<br />

<a name="faq55"></a>
**(55) ¿Cómo puedo marcar todos los mensajes como leídos / moverlos o borrarlos?**

Puedes usar selección múltiple para esto. Mantenga pulsado el primer mensaje, no levante el dedo y deslice hasta el último mensaje. Luego use el botón de tres puntos para ejecutar la acción deseada.

<br />

<a name="faq56"></a>
**(56) ¿Puedes añadir soporte para JMAP?**

Casi no hay proveedores que ofrezcan el protocolo [JMAP](https://jmap.io/), por lo que no vale la pena hacer un gran esfuerzo añadir soporte para esto en FairEmail.

<br />

<a name="faq57"></a>
**(57) ~~¿Puedo usar HTML en firmas?~~**

~~Sí, puede usar HTML en firmas si pega texto formateado en el campo de firma o usa el menú *Editar como HTML* para introducir HTML manualmente.~~

~~Tenga en cuenta que incluir enlaces e imágenes en los mensajes aumentará la probabilidad de que un mensaje sea visto como spam,~~ ~~especialmente cuando envias un mensaje a alguien por primera vez.~~

~~Vea [aquí](https://stackoverflow.com/questions/44410675/supported-html-tags-on-android-textview) para qué etiquetas HTML son soportadas.~~

<br />

<a name="faq58"></a>
**(58) ¿Qué significa un icono de correo electrónico abierto/cerrado?**

El icono de correo electrónico en la lista de carpetas puede ser abierto (contorneado) o cerrado (sólido):

![Imagen externa](https://github.com/M66B/FairEmail/blob/master/images/baseline_mail_outline_black_48dp.png)

Los cuerpos de los mensajes y los archivos adjuntos no se descargan de forma predeterminada.

![Imagen externa](https://github.com/M66B/FairEmail/blob/master/images/baseline_email_black_48dp.png)

Los cuerpos de los mensajes y los archivos adjuntos se descargan de forma predeterminada.

<br />

<a name="faq59"></a>
**(59) ¿Se pueden abrir mensajes originales en el navegador?**

Por razones de seguridad, los archivos con los textos originales del mensaje no son accesibles para otras aplicaciones, por lo que esto no es posible. En teoría el [Framework de Acceso a Almacenamiento](https://developer.android.com/guide/topics/providers/document-provider) podría utilizarse para compartir estos archivos, pero incluso Chrome de Google no puede manejar esto.

<br />

<a name="faq60"></a>
**(60) ¿Sabía que... ?**

* ¿Sabía que los mensajes favoritos pueden sincronizarse/mantenerse siempre? (esto puede ser activado en la configuración de recepción)
* ¿Sabía que puede mantener presionado el icono de 'redactar mensaje' para ir a la carpeta de borradores?
* ¿Sabía que hay una opción avanzada para marcar mensajes leídos al ser movidos? (archivar y enviar a papelera también es moverlos)
* ¿Sabía que puede seleccionar texto (o una dirección de correo electrónico) en cualquier aplicación en versiones recientes de Android y dejar que FairEmail lo busque?
* ¿Sabía que FairEmail tiene un modo tablet? Gire su dispositivo a modo apaisado y los hilos de conversación se abrirán en una segunda columna si hay suficiente espacio en la pantalla.
* ¿Sabía que puede mantener presionada una plantilla de respuesta para crear un borrador de mensaje a partir de la plantilla?
* ¿Sabía que puede dejar pulsado, mantener y deslizar para seleccionar una gama de mensajes?
* ¿Sabía que puede volver a intentar enviar mensajes tirando hacia abajo para actualizar en la bandeja de salida?
* ¿Sabía que puede deslizar una conversación a la izquierda o a la derecha para ir a la conversación siguiente o anterior?
* ¿Sabía que puede pulsar en una imagen para ver de dónde se descargará?
* ¿Sabía que puede mantener pulsado el icono de la carpeta en la barra de acciones para seleccionar una cuenta?
* ¿Sabía que puede mantener presionado el icono de la estrella en un hilo de conversación para establecer una estrella de color?
* ¿Sabía que puede abrir el cajón de navegación deslizando desde la izquierda, incluso cuando ve una conversación?
* ¿Sabía que puede mantener pulsado el icono de la persona para mostrar/ocultar los campos CC/CCO y recordar el estado de visibilidad para la próxima vez?
* ¿Sabía que puede insertar las direcciones de correo electrónico de un grupo de contactos Android a través del menú de tres puntos?
* ¿Sabía que si selecciona texto y pulsa responder, sólo se citará el texto seleccionado?

<br />

<a name="faq61"></a>
**(61) ¿Por qué algunos mensajes se muestran atenuados?**

Los mensajes atenuados (grises) son mensajes movidos localmente para los que el servidor aún no confirma el movimiento. Esto puede suceder cuando no hay conexión con el servidor o la cuenta (todavía). Estos mensajes se sincronizarán después de una conexión con el servidor y la cuenta se haya realizado o, si esto nunca sucede, será borrado si son demasiado viejos para ser sincronizados.

Puede que necesite sincronizar manualmente la carpeta, por ejemplo tirando hacia abajo.

Puede ver estos mensajes, pero no puede volver a mover estos mensajes hasta que el movimiento anterior haya sido confirmado.

Las [operaciones pendientes](#user-content-faq3) se muestran en la vista de operaciones accesible desde el menú de navegación principal.

<br />

<a name="faq62"></a>
**(62) ¿Qué métodos de autenticación son compatibles?**

Los siguientes métodos de autenticación están soportados y utilizados en este orden:

* LOGIN
* PLAIN
* CRAM-MD5
* XOAUTH2 ([Gmail](https://developers.google.com/gmail/imap/xoauth2-protocol), [Yandex](https://tech.yandex.com/oauth/))
* NTLM (no probado)

Los métodos de autenticación SASL, aparte de CRAM-MD5, no son compatibles porque [JavaMail para Android](https://javaee.github.io/javamail/Android) no soporta autenticación SASL.

Si su proveedor requiere un método de autenticación no soportado, probablemente obtendrá el mensaje de error *La autenticación falló*.

[Indicación de nombre de servidor](https://en.wikipedia.org/wiki/Server_Name_Indication) es soportada por [todas las versiones de Android soportadas](https://developer.android.com/training/articles/security-ssl).

<br />

<a name="faq63"></a>
**(63) ¿Cómo se redimensionan las imágenes para mostrarlas en pantalla?**

Imágenes grandes [PNG](https://en.wikipedia.org/wiki/Portable_Network_Graphics) y [JPEG](https://en.wikipedia.org/wiki/JPEG) en línea o adjuntas se redimensionarán automáticamente para mostrarlas en pantalla. Esto se debe a que los mensajes de correo electrónico están limitados en tamaño, dependiendo del proveedor mayormente entre 10 y 50 MB. Las imágenes se redimensionarán de forma predeterminada a un ancho y altura máximos de 1440 píxeles y se guardarán con un ratio de compresión del 90 %. Las imágenes se reducen usando factores numéricos enteros para reducir el uso de memoria y para conservar la calidad de imagen. Redimensionar automáticamente las imágenes adjuntas y/o en línea y el tamaño máximo de la imagen de destino se puede configurar en los ajustes de envío.

Si desea cambiar el tamaño de las imágenes para cada caso, puede utilizar [Send Reduced](https://f-droid.org/en/packages/mobi.omegacentauri.SendReduced/) o una aplicación similar.

<br />

<a name="faq64"></a>
**~~(64) ¿Puedes añadir acciones personalizadas para deslizar hacia la izquierda/derecha?~~**

~~La cosa más natural que hacer al deslizar una entrada de la lista a la izquierda o a la derecha es eliminar la entrada de la lista. ~ ~~La acción más natural en el contexto de una aplicación de correo electrónico es mover el mensaje a otra carpeta. ~ ~~Puede seleccionar la carpeta a la que quiere moverlo en la configuración de la cuenta.~~

~~Otras acciones, como marcar mensajes como leído y posponer mensajes están disponibles a través de selección múltiple.~~ ~~Puede mantener pulsado un mensaje para iniciar la selección múltiple. Vea también [esta pregunta](#user-content-faq55).~~

~~Deslizar a la izquierda o a la derecha para marcar un mensaje como leído o no leído no es natural porque el mensaje primero desaparece y luego regresa en una forma diferente.~~ ~~Note que hay una opción avanzada para marcar mensajes automáticamente como leídos al moverlos,~~ ~~que es en la mayoría de los casos un reemplazo perfecto para la secuencia de marcar como leído y mover a alguna carpeta.~~ ~~También puede marcar mensajes como leídos desde las notificaciones de nuevos mensajes.~~

~~Si quiere leer un mensaje más tarde, puedes esconderlo hasta una hora específica usando el menú *posponer*.~~

<br />

<a name="faq65"></a>
**(65) ¿Por qué se muestran atenuados algunos archivos adjuntos?**

Los archivos adjuntos en línea (imágenes) se muestran atenuados. Se supone que [los adjuntos en línea](https://tools.ietf.org/html/rfc2183) se descargarán y mostrarán automáticamente, pero dado que FairEmail no siempre descarga archivos adjuntos automáticamente, vea también [estas Preguntas Frecuentes](#user-content-faq40), FairEmail muestra todos los tipos de archivos adjuntos. Para distinguir los archivos adjuntos en línea y regulares, los archivos adjuntos en línea se muestran atenuados.

<br />

<a name="faq66"></a>
**(66) ¿Está disponible el FairEmail en la Biblioteca Familiar de Google Play?**

El precio de FairEmail es demasiado bajo, inferior al de la mayoría de aplicaciones similares, y hay [demasiadas comisiones e impuestos](#user-content-faq19), Google solo ya toma el 30 %, para justificar que FairEmail esté disponible en la [Biblioteca Familiar de Google Play](https://support.google.com/googleone/answer/7007852). Tenga en cuenta que Google promueve la Biblioteca Familiar, pero hace que los desarrolladores la paguen y no contribuye nada.

<br />

<a name="faq67"></a>
**(67) ¿Cómo puedo posponer conversaciones?**

Seleccione una o más conversaciones (pulsación larga para iniciar la selección múltiple), pulse el botón de tres puntos y seleccione *Posponer ...*. Alternativamente, en la vista de mensajes expandida use *Posponer ...* en el mensaje menú de tres puntos 'más' o la acción de lapso de tiempo en la barra de acción inferior. Seleccione el tiempo que la conversación(s) debe posponerse y confirmar tocando Aceptar. Las conversaciones se ocultarán durante el tiempo seleccionado y se mostrarán de nuevo después. Recibirá una notificación de nuevo mensaje como recordatorio.

También es posible posponer mensajes con [una regla](#user-content-faq71).

Puede mostrar mensajes pospuestos desmarcando *Filtrar fuera* > *Ocultar* en el menú de tres puntos.

Puedes pulsar en el pequeño icono de posponer para ver hasta cuándo está pospuesta una conversación.

Al seleccionar una duración cero de posponer puede cancelar el aplazamiento.

<br />

<a name="faq68"></a>
**~~(68) ¿Por qué el lector Adobe Acrobat no puede abrir archivos adjuntos PDF / aplicaciones Microsoft no abren documentos adjuntos?~~**

~~Adobe Acrobat Reader y las aplicaciones Microsoft todavía esperan acceso completo a todos los archivos almacenados.~~ ~~mientras que las aplicaciones deben usar el [framework de acceso aalmacenamiento](https://developer.android.com/guide/topics/providers/document-provider) desde Android KitKat (2013)~~ ~~para tener acceso a archivos compartidos activamente. Esto es por razones de privacidad y seguridad. ~~

~~Puede solucionar esto guardando el archivo adjunto y abriéndolo desde el lector de Adobe Acrobat / aplicación de Microsoft,~~ ~~pero se recomienda instalar un lector de documentos PDF actualizado y preferiblemente de código abierto,~~ ~~por ejemplo uno listado [aquí](https://github.com/offa/android-foss#-document--pdf-viewer).~~

<br />

<a name="faq69"></a>
**(69) ¿Puedes añadir desplazamiento automático hacia arriba al llegar un nuevo mensaje?**

La lista de mensajes se desplaza automáticamente hacia arriba al navegar desde una notificación de nuevo mensaje o después de una actualización manual. Siempre desplazarse automáticamente ante la llegada de nuevos mensajes interferiría con su propio desplazamiento, pero si lo desea, puede activarlo en la configuración.

<br />

<a name="faq70"></a>
**(70) ¿Cuándo se expandirán los mensajes automáticamente?**

Al navegar a una conversación un mensaje se expandirá si:

* Sólo hay un mensaje en la conversación
* Hay exactamente un mensaje no leído en la conversación

Hay una excepción: el mensaje no se ha descargado todavía y el mensaje es demasiado grande para descargar automáticamente en una conexión (móvil) medida. Puede establecer o desactivar el tamaño máximo del mensaje en la pestaña de 'conexión' de los ajustes.

Mensajes duplicados (archivados), mensajes en papelera y borradores no se cuentan.

Los mensajes se marcarán automáticamente como leídos al expandirse, a menos que esto se haya desactivado en la configuración de cada cuenta.

<br />

<a name="faq71"></a>
**(71) ¿Cómo uso las reglas de filtro?**

Puede editar las reglas de filtro manteniendo presionada una carpeta en la lista de carpetas.

Se aplicarán nuevas reglas a los nuevos mensajes recibidos en la carpeta, no a los mensajes existentes. Puede marcar la regla y aplicarla a los mensajes existentes o, alternativamente, mantenga presionada la regla en la lista de reglas y seleccione *Ejecutar ahora*.

Necesitará dar un nombre a una regla y necesitará definir el orden en el que una regla debe ser ejecutada en relación a otras reglas.

Puede desactivar una regla y dejar de procesar otras reglas después de que se haya ejecutado una regla.

Las siguientes condiciones de regla están disponibles:

* El remitente contiene
* El destinatario contiene
* El asunto contiene
* Tiene archivos adjuntos
* El encabezado contiene
* Día/hora entre

Todas las condiciones de una regla deben ser verdaderas para que la acción de la regla se ejecute. Todas las condiciones son opcionales, pero debe haber al menos una condición, para evitar que coincida con todos los mensajes. Si quiere coincidir con todos los remitentes o todos los destinatarios, puede usar el carácter @ como condición porque todas las direcciones de correo electrónico contendrán este carácter.

Tenga en cuenta que las direcciones de correo electrónico están formateadas así:

`
"Alguien" <somebody@example.org>`

Puedes usar varias reglas, posiblemente con un *dejar de procesar*, para una *o* o una *no* condición.

La coincidencia no es sensible a mayúsculas y minúsculas, a menos que utilice [expresiones regulares](https://en.wikipedia.org/wiki/Regular_expression). Consulte [aquí](https://developer.android.com/reference/java/util/regex/Pattern) para ver la documentación de las expresiones regulares de Java. Puede probar una regex [aquí](https://regexr.com/).

Tenga en cuenta que una expresión regular soporta un operador *o*, así que si quiere coincidir con varios remitentes, puedes hacer esto:

`
.*alice@ejemplo\.org.*|.*bob@ejemplo\.org.*|.*carol@ejemplo\.org.*`

Tenga en cuenta que [modo punto](https://developer.android.com/reference/java/util/regex/Pattern#DOTALL) está habilitado para ser capaz de emparejar [encabezados desplegados](https://tools.ietf.org/html/rfc2822#section-3.2.3).

Puede seleccionar una de estas acciones para aplicar a los mensajes coincidentes:

* Ninguna acción (útil para *no*)
* Marcar como leído
* Marcar como no leído
* Ocultar
* Suprimir notificación
* Posponer
* Destacar
* Establecer importancia (prioridad local)
* Añadir palabra clave
* Mover
* Copiar (Gmail: etiqueta)
* Responder (con plantilla)
* Texto a voz (remitente y asunto)
* Automatización (Tasker, etc.)

Las reglas se aplican directamente después de que el encabezado del mensaje ha sido obtenido, pero antes de que el texto del mensaje haya sido descargado, por lo que no es posible aplicar las condiciones al texto del mensaje. Tenga en cuenta que los textos de mensajes grandes se descargan bajo demanda en una conexión medida para ahorrar en el uso de datos.

Si desea reenviar un mensaje, considere utilizar la acción mover en su lugar. Esto será más confiable que reenviar, ya que los mensajes reenviados pueden ser considerados como spam.

Dado que los encabezados de los mensajes no se descargan y almacenan por defecto para ahorrar batería y datos y para ahorrar espacio de almacenamiento no es posible previsualizar qué mensajes coincidirían con una condición de regla de encabezado.

Algunas condiciones comunes de cabecera (regex):

* *.&ast;Auto-Enviado:.&ast;* [RFC3834](https://tools.ietf.org/html/rfc3834)
* *.&ast;Content-Type: multipart/report.&ast;* [RFC3462](https://tools.ietf.org/html/rfc3462)

In the three-dots *more* message menu there is an item to create a rule for a received message with the most common conditions filled in.

The POP3 protocol does not support setting keywords and moving or copying messages.

Using rules is a pro feature.

<br />

<a name="faq72"></a>
**(72) What are primary accounts/identities?**

The primary account is used when the account is ambiguous, for example when starting a new draft from the unified inbox.

Similarly, the primary identity of an account is used when the identity is ambiguous.

There can be just one primary account and there can be just one primary identity per account.

<br />

<a name="faq73"></a>
**(73) Is moving messages across accounts safe/efficient?**

Moving messages across accounts is safe because the raw, original messages will be downloaded and moved and because the source messages will be deleted only after the target messages have been added

Batch moving messages across accounts is efficient if both the source folder and target folder are set to synchronize, else FairEmail needs to connect to the folder(s) for each message.

<br />

<a name="faq74"></a>
**(74) Why do I see duplicate messages?**

Some providers, notably Gmail, list all messages in all folders, except trashed messages, in the archive (all messages) folder too. FairEmail shows all these messages in a non obtrusive way to indicate that these messages are in fact the same message.

Gmail allows one message to have multiple labels, which are presented to FairEmail as folders. This means that messages with multiple labels will be shown multiple times as well.

<br />

<a name="faq75"></a>
**(75) Can you make an iOS, Windows, Linux, etc version?**

A lot of knowledge and experience is required to successfully develop an app for a specific platform, which is why I develop apps for Android only.

<br />

<a name="faq76"></a>
**(76) What does 'Clear local messages' do?**

The folder menu *Clear local messages* removes messages from the device which are present on the server too. It does not delete messages from the server. This can be useful after changing the folder settings to not download the message content (text and attachments), for example to save space.

<br />

<a name="faq77"></a>
**(77) Why are messages sometimes shown with a small delay?**

Depending on the speed of your device (processor speed and maybe even more memory speed) messages might be displayed with a small delay. FairEmail is designed to dynamically handle a large number of messages without running out of memory. This means that messages needs to be read from a database and that this database needs to be watched for changes, both of which might cause small delays.

Some convenience features, like grouping messages to display conversation threads and determining the previous/next message, take a little extra time. Note that there is no *the* next message because in the meantime a new message might have been arrived.

When comparing the speed of FairEmail with similar apps this should be part of the comparison. It is easy to write a similar, faster app which just displays a lineair list of messages while possible using too much memory, but it is not so easy to properly manage resource usage and to offer more advanced features like conversation threading.

FairEmail is based on the state-of-the-art [Android architecture components](https://developer.android.com/topic/libraries/architecture/), so there is little room for performance improvements.

<br />

<a name="faq78"></a>
**(78) How do I use schedules?**

In the receive settings you can enable scheduling and set the time period and the day of weeks when messages should be received.

Note that an end time equal to or earlier than the start time is considered to be 24 hours later.

For more complex schemes you could set one or more accounts to manual synchronization and send this command to FairEmail to check for new messages:

```
(adb shell) am startservice -a eu.faircode.email.POLL
```

For a specific account:

```
(adb shell) am startservice -a eu.faircode.email.POLL --es account Gmail
```

You can also automate turning receiving messages on and off by sending these commands to FairEmail:

```
(adb shell) am startservice -a eu.faircode.email.ENABLE
(adb shell) am startservice -a eu.faircode.email.DISABLE
```

To enable/disable a specific account:

```
(adb shell) am startservice -a eu.faircode.email.ENABLE --es account Gmail
(adb shell) am startservice -a eu.faircode.email.DISABLE --es account Gmail
```

Note that disabling an account will hide the account and all associated folders and messages.

You can automatically send commands with for example [Tasker](https://tasker.joaoapps.com/userguide/en/intents.html):

```
New task: Something recognizable
Action Category: Misc/Send Intent
Action: eu.faircode.email.ENABLE
Target: Service
```

To enable/disable an account with the name *Gmail*:

```
Extras: account:Gmail
```

Account names are case sensitive.

Automation can be used for more advanced schedules, like for example multiple synchronization periods per day or different synchronization periods for different days.

It is possible to install FairEmail in multiple user profiles, for example a personal and a work profile, and to configure FairEmail differently in each profile, which is another possibility to have different synchronization schedules and to synchronize a different set of accounts.

It is also possible to create [rules](#user-content-faq71) with a time condition and to snooze messages until the end time of the time condition. This way it is possible to snooze business related messages until the start of the business hours. This also means that the messages will be on your device for when there is no internet connection, for example when flying.


Scheduling is a pro feature.

<br />

<a name="faq79"></a>
**(79) How do I use synchronize on demand (manual)?**

Normally, FairEmail maintains a connection to the configured email servers whenever possible to receive messages in real-time. If you don't want this, for example to be not disturbed or to save on battery usage, just disable receiving in the receive settings. This will stop the background service which takes care of automatic synchronization and will remove the associated status bar notification.

You can also enable *Synchronize manually* in the advanced account settings if you want to manually synchronize specific accounts only.

You can use pull-down-to-refresh in a message list or use the folder menu *Synchronize now* to manually synchronize messages.

If you want to synchronize some or all folders of an account manually, just disable synchronization for the folders (but not of the account).

You'll likely want to disabled [browse on server](#user-content-faq24) too.

<br />

<a name="faq80"></a>
**~~(80) How do I fix the error 'Unable to load BODYSTRUCTURE' ?~~**

~~The error message *Unable to load BODYSTRUCTURE* is caused by bugs in the email server,~~ ~~see [here](https://javaee.github.io/javamail/FAQ#imapserverbug) for more details.~~

~~FairEmail already tries to workaround these bugs, but if this fail you'll need to ask for support from your provider.~~

<br />

<a name="faq81"></a>
**~~(81) Can you make the background of the original message dark in the dark theme?~~**

~~The original message is shown as the sender has sent it, including all colors.~~ ~~Changing the background color would not only make the original view not original anymore, it can also result in unreadable messages.~~

<br />

<a name="faq82"></a>
**(82) What is a tracking image?**

Please see [here](https://en.wikipedia.org/wiki/Web_beacon) about what a tracking image exactly is. In short tracking images keep track if you opened a message.

FairEmail will in most cases automatically recognize tracking images and replace them by this icon:

![External image](https://github.com/M66B/FairEmail/blob/master/images/baseline_my_location_black_48dp.png)

Automatic recognition of tracking images can be disabled in the privacy settings.

<br />

<a name="faq84"></a>
**(84) What are local contacts for?**

Local contact information is based on names and addresses found in incoming and outgoing messages.

The main use of the local contacts storage is to offer auto completion when no contacts permission has been granted to FairEmail.

Another use is to generate [shortcuts](#user-content-faq31) on recent Android versions to quickly send a message to frequently contacted people. This is also why the number of times contacted and the last time contacted is being recorded and why you can make a contact a favorite or exclude it from favorites by long pressing it.

The list of contacts is sorted on number of times contacted and the last time contacted.

By default only names and addresses to whom you send messages to will be recorded. You can change this in the send settings.

<br />

<a name="faq85"></a>
**(85) Why is an identity not available?**

An identity is available for sending a new message or replying or forwarding an existing message only if:

* the identity is set to synchronize (send messages)
* the associated account is set to synchronize (receive messages)
* the associated account has a drafts folder

FairEmail will try to select the best identity based on the *to* address of the message replied to / being forwarded.

<br />

<a name="faq86"></a>
**~~(86) What are 'extra privacy features'?~~**

~~The advanced option *extra privacy features* enables:~~

* ~~Looking up the owner of the IP address of a link~~
* ~~Detection and removal of [tracking images](#user-content-faq82)~~

<br />

<a name="faq87"></a>
**(87) What does 'invalid credentials' mean?**

The error message *invalid credentials* means either that the user name and/or password is incorrect, for example because the password was changed or expired, or that the account authorization has expired.

If the password is incorrect/expired, you will have to update the password in the account and/or identity settings.

If the account authorization has expired, you will have to select the account again. You will likely need to save the associated identity again as well.

<br />

<a name="faq88"></a>
**(88) How can I use a Yahoo, AOL or Sky account?**

To authorize a Yahoo, AOL, or Sky account you will need to create an app password. For instructions, please see here:

* [for Yahoo](https://help.yahoo.com/kb/generate-third-party-passwords-sln15241.html)
* [for AOL](https://help.aol.com/articles/Create-and-manage-app-password)
* [for Sky](https://www.sky.com/help/articles/getting-started-with-sky-yahoo-mail) (under *Other email apps*)

Please see [this FAQ](#user-content-faq111) about OAuth support.

Note that Yahoo, AOL, and Sky do not support standard push messages. The Yahoo email app uses a proprietary, undocumented protocol for push messages.

Push messages require [IMAP IDLE](https://en.wikipedia.org/wiki/IMAP_IDLE) and the Yahoo email server does not report IDLE as capability:

```
Y1 CAPABILITY
* CAPABILITY IMAP4rev1 ID MOVE NAMESPACE XYMHIGHESTMODSEQ UIDPLUS LITERAL+ CHILDREN X-MSG-EXT UNSELECT OBJECTID
Y1 OK CAPABILITY completed
```

<br />

<a name="faq89"></a>
**(89) How can I send plain text only messages?**

By default FairEmail sends each message both as plain text and as HTML formatted text because almost every receiver expects formatted messages these days. If you want/need to send plain text messages only, you can enable this in the advanced identity options. You might want to create a new identity for this if you want/need to select sending plain text messages on a case-by-case basis.

<br />

<a name="faq90"></a>
**(90) Why are some texts linked while not being a link?**

FairEmail will automatically link not linked web links (http and https) and not linked email addresses (mailto) for your convenience. However, texts and links are not easily distinguished, especially not with lots of [top level domains](https://en.wikipedia.org/wiki/List_of_Internet_top-level_domains) being words. This is why texts with dots are sometimes incorrectly recognized as links, which is better than not recognizing some links.

Links for less usual protocols like telnet and ftp will not automatically be linked.

<br />

<a name="faq91"></a>
**~~(91) Can you add periodical synchronization to save battery power?~~**

~~Synchronizing messages is an expensive proces because the local and remote messages need to be compared,~~ ~~so periodically synchronizing messages will not result in saving battery power, more likely the contrary.~~

~~See [this FAQ](#user-content-faq39) about optimizing battery usage.~~


<br />

<a name="faq92"></a>
**(92) Can you add spam filtering, verification of the DKIM signature and SPF authorization?**

Spam filtering, verification of the [DKIM](https://en.wikipedia.org/wiki/DomainKeys_Identified_Mail) signature and [SPF](https://en.wikipedia.org/wiki/Sender_Policy_Framework) authorization is a task of email servers, not of an email client. Servers generally have more memory and computing power, so they are much better suited to this task than battery-powered devices. Also, you'll want spam filtered for all your email clients, possibly including web email, not just one email client. Moreover, email servers have access to information, like the IP address, etc of the connecting server, which an email client has no access to.

Of course you can report messages as spam with FairEmail, which will move the reported messages to the spam folder and train the spam filter of the provider, which is how it is supposed to work. This can be done automatically with [filter rules](#user-content-faq71) too. Blocking the sender will create a filter rule to automatically move future messages of the same sender into the spam folder.

Note that you should not delete spam messages, also not from the spam folder, because the email server uses the messages in the spam folder to "learn" what spam messages are.

If you receive a lot of spam messages in your inbox, the best you can do is to contact the email provider to ask if spam filtering can be improved.

Also, FairEmail can show a small red warning flag when DKIM, SPF or [DMARC](https://en.wikipedia.org/wiki/DMARC) authentication failed on the receiving server. You can enable/disable [authentication verification](https://en.wikipedia.org/wiki/Email_authentication) in the display settings.

FairEmail can show a warning flag too if the domain name of the (reply) email address of the sender does not define an MX record pointing to an email server. This can be enabled in the receive settings. Be aware that this will slow down synchronization of messages significantly.

If legitimate messages are failing authentication, you should notify the sender because this will result in a high risk of messages ending up in the spam folder. Moreover, without proper authentication there is a risk the sender will be impersonated. The sender might use [this tool](https://www.mail-tester.com/) to check authentication and other things.

<br />

<a name="faq93"></a>
**(93) Can you allow installation/data storage on external storage media (sdcard)?**

FairEmail uses services and alarms, provides widgets and listens for the boot completed event to be started on device start, so it is not possible to store the app on external storage media, like an sdcard. See also [here](https://developer.android.com/guide/topics/data/install-location).

Messages, attachments, etc stored on external storage media, like an sdcard, can be accessed by other apps and is therefore not safe. See [here](https://developer.android.com/training/data-storage) for the details.

When needed you can save (raw) messages via the three-dots menu just above the message text and save attachments by tapping on the floppy icon.

If you need to save on storage space, you can limit the number of days messages are being synchronized and kept for. You can change these settings by long pressing a folder in the folder list and selecting *Edit properties*.

<br />

<a name="faq94"></a>
**(94) What does the red/orange stripe at the end of the header mean?**

The red/orange stripe at the left side of the header means that the DKIM, SPF or DMARC authentication failed. See also [this FAQ](#user-content-faq92).

<br />

<a name="faq95"></a>
**(95) Why are not all apps shown when selecting an attachment or image?**

For privacy and security reasons FairEmail does not have permissions to directly access files, instead the Storage Access Framework, available and recommended since Android 4.4 KitKat (released in 2013), is used to select files.

If an app is listed depends on if the app implements a [document provider](https://developer.android.com/guide/topics/providers/document-provider). If the app is not listed, you might need to ask the developer of the app to add support for the Storage Access Framework.

Android Q will make it harder and maybe even impossible to directly access files, see [here](https://developer.android.com/preview/privacy/scoped-storage) and [here](https://www.xda-developers.com/android-q-storage-access-framework-scoped-storage/) for more details.

<br />

<a name="faq96"></a>
**(96) Where can I find the IMAP and SMTP settings?**

The IMAP settings are part of the (custom) account settings and the SMTP settings are part of the identity settings.

<br />

<a name="faq97"></a>
**(97) What is 'cleanup' ?**

About each four hours FairEmail runs a cleanup job that:

* Removes old message texts
* Removes old attachment files
* Removes old image files
* Removes old local contacts
* Removes old log entries

Note that the cleanup job will only run when the synchronize service is active.

<br />

<a name="faq98"></a>
**(98) Why can I still pick contacts after revoking contacts permissions?**

After revoking contacts permissions Android does not allow FairEmail access to your contacts anymore. However, picking contacts is delegated to and done by Android and not by FairEmail, so this will still be possible without contacts permissions.

<br />

<a name="faq99"></a>
**(99) Can you add a rich text or markdown editor?**

FairEmail provides common text formatting (bold, italic, underline, text size and color) via a toolbar that appears after selecting some text.

A [Rich text](https://en.wikipedia.org/wiki/Formatted_text) or [Markdown](https://en.wikipedia.org/wiki/Markdown) editor would not be used by many people on a small mobile device and, more important, Android doesn't support a rich text editor and most rich text editor open source projects are abandoned. See [here](https://forum.xda-developers.com/showpost.php?p=79061829&postcount=4919) for some more details about this.

<br />

<a name="faq100"></a>
**(100) How can I synchronize Gmail categories?**

You can synchronize Gmail categories by creating filters to label categorized messages:

* Create a new filter via Gmail > Settings (wheel) > Filters and Blocked Addresses > Create a new filter
* Enter a category search (see below) in the *Has the words* field and click *Create filter*
* Check *Apply the label* and select a label and click *Create filter*

Possible categories:

```
category:social
category:updates
category:forums
category:promotions
```

Unfortunately, this is not possible for snoozed messages folder.

You can use *Force sync* in the three-dots menu of the unified inbox to let FairEmail synchronize the folder list again and you can long press the folders to enable synchronization.

<br />

<a name="faq101"></a>
**(101) What does the blue/orange dot at the bottom of the conversations mean?**

The dot shows the relative position of the conversation in the message list. The dot will be show orange when the conversation is the first or last in the message list, else it will be blue. The dot is meant as an aid when swiping left/right to go to the previous/next conversation.

The dot is disabled by default and can be enabled with the display settings *Show relative conversation position with a dot*.

<br />

<a name="faq102"></a>
**(102) How can I enable auto rotation of images?**

Images will automatically be rotated when automatic resizing of images is enabled in the settings (enabled by default). However, automatic rotating depends on the [Exif](https://en.wikipedia.org/wiki/Exif) information to be present and to be correct, which is not always the case. Particularly not when taking a photo with a camara app from FairEmail.

Note that only [JPEG](https://en.wikipedia.org/wiki/JPEG) and [PNG](https://en.wikipedia.org/wiki/Portable_Network_Graphics) images can contain Exif information.

<br />

<a name="faq103"></a>
**(103) How can I record audio?**

You can record audio if you have a recording app installed which supports the [RECORD_SOUND_ACTION](https://developer.android.com/reference/android/provider/MediaStore.Audio.Media#RECORD_SOUND_ACTION) intent. If no supported app is installed, FairEmail will not show a record audio action/icon.

Unfortunately and surprisingly, most recording apps do not seem to support this intent (they should).

<br />

<a name="faq104"></a>
**(104) What do I need to know about error reporting?**

* Error reports will help improve FairEmail
* Error reporting is optional and opt-in
* Error reporting can be enabled/disabled in the settings, section miscellaneous
* Error reports will automatically be sent anonymously to [Bugsnag](https://www.bugsnag.com/)
* Bugsnag for Android is [open source](https://github.com/bugsnag/bugsnag-android)
* See [here](https://docs.bugsnag.com/platforms/android/automatically-captured-data/) about what data will be sent in case of errors
* See [here](https://docs.bugsnag.com/legal/privacy-policy/) for the privacy policy of Bugsnag
* Error reports will be sent to *sessions.bugsnag.com:443* and *notify.bugsnag.com:443*

<br />

<a name="faq105"></a>
**(105) How does the roam-like-at-home option work?**

FairEmail will check if the country code of the SIM card and the country code of the network are in the [EU roam-like-at-home countries](https://en.wikipedia.org/wiki/European_Union_roaming_regulations#Territorial_extent) and assumes no roaming if the country codes are equal and the advanced roam-like-at-home option is enabled.

So, you don't have to disable this option if you don't have an EU SIM or are not connected to an EU network.

<br />

<a name="faq106"></a>
**(106) Which launchers can show a badge count with the number of unread messages?**

Please [see here](https://github.com/leolin310148/ShortcutBadger#supported-launchers) for a list of launchers which can show the number of unread messages.

Note that the notification setting *Show launcher icon with number of new messages* needs to be enabled (default enabled).

Only *new* unread messages in folders set to show new message notifications will be counted, so messages marked unread again and messages in folders set to not show new message notification will not be counted.

Depending on what you want, the notification settings *Let the number of new messages match the number of notifications* needs to be enabled or disabled.

This feature depends on support of your launcher. FairEmail merely 'broadcasts' the number of unread messages using the ShortcutBadger library. If it doesn't work, this cannot be fixed by changes in FairEmail.

Some launchers display '1' for [the monitoring notification](#user-content-faq2), despite FairEmail explicitly requesting not to show a badge for this notification. This could be caused by a bug in the launcher app or in your Android version. Please double check if the notification dot is disabled for the receive (service) notification channel. You can go to the right notification channel settings via the notification settings of FairEmail. This might not be obvious, but you can tap on the channel name for more settings.

Note that Tesla Unread is [not supported anymore](https://forum.xda-developers.com/android/general/bad-news-tesla-unread-devoloper-t3920415).

FairEmail does send a new message count intent as well:

```
eu.faircode.email.NEW_MESSAGE_COUNT
```

The number of new, unread messages will be in an integer "*count*" parameter.

<br />

<a name="faq107"></a>
**(107) How do I use colored stars?**

You can set a colored star via the *more* message menu, via multiple selection (started by long pressing a message), by long pressing a star in a conversation or automatically by using [rules](#user-content-faq71).

You need to know that colored stars are not supported by the IMAP protocol and can therefore not be synchronized to an email server. This means that colored stars will not be visible in other email clients and will be lost on downloading messages again. However, the stars (without color) will be synchronized and will be visible in other email clients, when supported.

Some email clients use IMAP keywords for colors. However, not all servers support IMAP keywords and besides that there are no standard keywords for colors.

<br />

<a name="faq108"></a>
**~~(108) Can you add permanently delete messages from any folder?~~**

~~When you delete messages from a folder the messages will be moved to the trash folder, so you have a chance to restore the messages.~~ ~~You can permanently delete messages from the trash folder.~~ ~~Permanently delete messages from other folders would defeat the purpose of the trash folder, so this will not be added.~~

<br />

<a name="faq109"></a>
**~~(109) Why is 'select account' available in official versions only?~~**

~~Using *select account* to select and authorize Google accounts require special permission from Google for security and privacy reasons.~~ ~~This special permission can only be acquired for apps a developer manages and is responsible for.~~ ~~Third party builds, like the F-Droid builds, are managed by third parties and are the responsibility of these third parties.~~ ~~So, only these third parties can acquire the required permission from Google.~~ ~~Since these third parties do not actually support FairEmail, they are most likely not going to request the required permission.~~

~~You can solve this in two ways:~~

* ~~Switch to the official version of FairEmail, see [here](https://github.com/M66B/FairEmail/blob/master/README.md#downloads) for the options~~
* ~~Use app specific passwords, see [this FAQ](#user-content-faq6)~~

~~Using *select account* in third party builds is not possible in recent versions anymore.~~ ~~In older versions this was possible, but it will now result in the error *UNREGISTERED_ON_API_CONSOLE*.~~

<br />

<a name="faq110"></a>
**(110) Why are (some) messages empty and/or attachments corrupt?**

Empty messages and/or corrupt attachments are probably being caused by a bug in the server software. Older Microsoft Exchange software is known to cause this problem. Mostly you can workaround this by disabling *Partial fetch* in the advanced account settings:

Setup > Step 1 > Manage > Tap account > Tap advanced > Partial fetch > uncheck

After disabling this setting, you can use the message 'more' (three dots) menu to 'resync' empty messages. Alternatively, you can *Delete local messages* by long pressing the folder(s) in the folder list and synchronize all messages again.

Disabling *Partial fetch* will result in more memory usage.

<br />

<a name="faq111"></a>
**(111) Is OAuth supported?**

OAuth for Gmail is supported via the quick setup wizard. The Android account manager will be used to fetch and refresh OAuth tokens for selected on-device accounts. OAuth for non on-device accounts is not supported because Google requires a [yearly security audit](https://support.google.com/cloud/answer/9110914) ($15,000 to $75,000) for this.

OAuth for Yandex is supported via the quick setup wizard.

OAuth for Office 365 accounts is supported, but Microsoft does not offer OAuth for Outlook, Live and Hotmail accounts (yet?).

OAuth access for Yahoo was requested, but Yahoo never responded to the request. OAuth for AOL [was deactivated](https://www.programmableweb.com/api/aol-open-auth) by AOL. Verizon owns both AOL and Yahoo, collectively named [Oath inc](https://en.wikipedia.org/wiki/Verizon_Media). So, it is reasonable to assume that OAuth is not supported by Yahoo anymore too.

<br />

<a name="faq112"></a>
**(112) Which email provider do you recommend?**

FairEmail is an email client only, so you need to bring your own email address.

There are plenty of email providers to choose from. Which email provider is best for you depends on your wishes/requirements. Please see the websites of [Restore privacy](https://restoreprivacy.com/secure-email/) or [Privacy Tools](https://www.privacytools.io/providers/email/) for a list of privacy oriented email providers with advantages and disadvantages.

Some providers, like ProtonMail, Tutanota, use proprietary email protocols, which make it impossible to use third party email apps. Please see [this FAQ](#user-content-faq129) for more information.

Using your own (custom) domain name, which is supported by most email providers, will make it easier to switch to another email provider.

<br />

<a name="faq113"></a>
**(113) How does biometric authentication work?**

If your device has a biometric sensor, for example a fingerprint sensor, you can enable/disable biometric authentication in the navigation (hamburger) menu of the setup screen. When enabled FairEmail will require biometric authentication after a period of inactivity or after the screen has been turned off while FairEmail was running. Activity is navigation within FairEmail, for example opening a conversation thread. The inactivity period duration can be configured in the miscellaneous settings. When biometric authentication is enabled new message notifications will not show any content and FairEmail won't be visible on the Android recents screen.

Biometric authentication is meant to prevent others from seeing your messages only. FairEmail relies on device encryption for data encryption, see also [this FAQ](#user-content-faq37).

Biometric authentication is a pro feature.

<br />

<a name="faq114"></a>
**(114) Can you add an import for the settings of other email apps?**

The format of the settings files of most other email apps is not documented, so this is difficult. Sometimes it is possible to reverse engineer the format, but as soon as the settings format changes things will break. Also, settings are often incompatible. For example, FairEmail has unlike most other email apps settings for the number of days to synchronize messages for and for the number of days to keep messages for, mainly to save on battery usage. Moreover, setting up an account/identity with the quick setup is simple, so it is not really worth the effort.

<br />

<a name="faq115"></a>
**(115) Can you add email address chips?**

Email address [chips](https://material.io/design/components/chips.html) look nice, but cannot be edited, which is quite inconvenient when you made a typo in an email address.

Note that FairEmail will select the address only when long pressing an address, which makes it easy to delete an address.

Chips are not suitable for showing in a list and since the message header in a list should look similar to the message header of the message view it is not an option to use chips for viewing messages.

Reverted [commit](https://github.com/M66B/FairEmail/commit/2c80c25b8aa75af2287f471b882ec87d5a5a5015).

<br />

<a name="faq116"></a>
**~~(116) How can I show images in messages from trusted senders by default?~~**

~~You can show images in messages from trusted senders by default by enabled the display setting *Automatically show images for known contacts*.~~

~~Contacts in the Android contacts list are considered to be known and trusted,~~ ~~unless the contact is in the group / has the label '*Untrusted*' (case insensitive).~~

<br />

<a name="faq38"></a>
<a name="faq117"></a>
**(117) Can you help me restore my purchase?**

Google manages all purchases, so as a developer I have little control over purchases. So, basically the only thing I can do, is give some advice:

* Make sure you have an active, working internet connection
* Make sure you are logged in with the right Google account and that there is nothing wrong with your Google account
* Make sure you installed FairEmail via the right Google account if you configured multiple Google accounts on your device
* Open the Play store app and wait at least a minute to give it time to synchronize with the Google servers
* Open FairEmail and navigate to the pro features screen to let FairEmail check the purchases

You can also try to clear the cache of the Play store app via the Android apps settings. Restarting the device might be necessary to let the Play store recognize the purchase correctly.

Note that:

* Purchases are stored in the Google cloud and cannot get lost
* There is no time limit on purchases, so they cannot expire
* Google does not expose details (name, e-mail, etc) about buyers to developers
* An app like FairEmail cannot select which Google account to use
* It may take a while until the Play store app has synchronized a purchase to another device
* Play Store purchases cannot be used without the Play Store, which is also not allowed by Play Store rules

If you cannot solve the problem with the purchase, you will have to contact Google about it.

<br />

<a name="faq118"></a>
**(118) What does 'Remove tracking parameters' exactly?**

Checking *Remove tracking parameters* will remove all [UTM parameters](https://en.wikipedia.org/wiki/UTM_parameters) from a link.

<br />

<a name="faq119"></a>
**~~(119) Can you add colors to the unified inbox widget?~~**

~~The widget is designed to look good on most home/launcher screens by making it monochrome and by using a half transparent background.~~ ~~This way the widget will nicely blend in, while still being properly readable.~~

~~Adding colors will cause problems with some backgrounds and will cause readability problems, which is why this won't be added.~~

Due to Android limitations it is not possible to dynamically set the opacity of the background and to have rounded corners at the same time.

<br />

<a name="faq120"></a>
**(120) Why are new message notifications not removed on opening the app?**

New message notifications will be removed on swiping notifications away or on marking the associated messages read. Opening the app will not remove new message notifications. This gives you a choice to leave new message notifications as a reminder that there are still unread messages.

On Android 7 Nougat and later new message notifications will be [grouped](https://developer.android.com/training/notify-user/group). Tapping on the summary notification will open the unified inbox. The summary notification can be expanded to view individual new message notifications. Tapping on an individual new message notification will open the conversation the message it is part of. See [this FAQ](#user-content-faq70) about when messages in a conversation will be auto expanded and marked read.

<br />

<a name="faq121"></a>
**(121) How are messages grouped into a conversation?**

By default FairEmail groups messages in conversations. This can be turned of in the display settings.

FairEmail groups messages based on the standard *Message-ID*, *In-Reply-To* and *References* headers. FairEmail does not group on other criteria, like the subject, because this could result in grouping unrelated messages and would be at the expense of increased battery usage.

<br />

<a name="faq122"></a>
**~~(122) Why is the recipient name/email address show with a warning color?~~**

~~The recipient name and/or email address in the addresses section will be shown in a warning color~~ ~~when the sender domain name and the domain name of the *to* address do not match.~~ ~~Mostly this indicates that the message was received *via* an account with another email address.~~

<br />

<a name="faq123"></a>
**(123) What will happen when FairEmail cannot connect to an email server?**

When FairEmail cannot connect to an email server to receive messages, for example when the internet connection is bad or a firewall or a VPN is blocking the connection, FairEmail will wait 8, 16 and 32 seconds while keeping the device awake (=use battery power) and try again to connect. If this fails, FairEmail will schedule an alarm to retry after 15, 30 and 60 minutes and let the device sleep (=no battery usage).

Between connectivity changes there is a wait of 90 seconds to give the email server the opportunity to discover the old connection is broken. This is necessary because the internet connection of a mobile device is often lost abruptly and to prevent the problem described in [this FAQ](#user-content-faq23).

Note that [Android doze mode](https://developer.android.com/training/monitoring-device-state/doze-standby) does not allow to wake the device earlier than after 15 minutes.

*Force sync* in the three-dots menu of the unified inbox can be used to let FairEmail attempt to reconnect without waiting.

Sending messages will be retried on connectivity changes only (reconnecting to the same network or connecting to another network) to prevent the email server from blocking the connection permanently. You can pull down the outbox to retry manually.

Note that sending will not be retried in case of authentication problems and when the server rejected the message. In this case you can open/expand the message and use the undo icon to move the message to the drafts folder, possible change it and send it again.

<br />

<a name="faq124"></a>
**(124) Why do I get 'Message too large or too complex to display'?**

The message *Message too large or too complex to display* will be shown if there are more than 100,000 characters or more than 500 links in a message. Reformatting and displaying such messages will take too long. You can try to use the original message view, powered by the browser, instead.

<br />

<a name="faq125"></a>
**(125) What are the current experimental features?**

* ...

<br />

<a name="faq126"></a>
**(126) Can message previews be sent to my wearable?**

FairEmail fetches a message in two steps:

1. Fetch message headers
1. Fetch message text and attachments

Directly after the first step new messages will be notified. However, only until after the second step the message text will be available. FairEmail updates exiting notifications with a preview of the message text, but unfortunately wearable notifications cannot be updated.

Since there is no guarantee that a message text will always be fetched directly after a message header, it is not possible to guarantee that a new message notification with a preview text will always be sent to a wearable.

If you think this is good enough, you can enable the notification option *Only send notifications with a message preview to wearables* and if this does not work, you can try to enable the notification option *Show notifications with a preview text only*.

If you want to have the full message text sent to your wearable, you can enable the notification option *Preview all text*. Note that some wearables are known to crash with this option enabled.

If you use a Samsung wearable with the Galaxy Wearable (Samsung Gear) app, you might need to enable notifications for FairEmail when the setting *Notifications*, *Apps installed in the future* is turned off in this app.

<br />

<a name="faq127"></a>
**(127) How can I fix 'Syntactically invalid HELO argument(s)'?**

The error *... Syntactically invalid HELO argument(s) ...* means that the SMTP server rejected the local IP address or host name. You can likely fix this error by enabling or disabling the advanced indentity option *Use local IP address instead of host name*.

<br />

<a name="faq128"></a>
**(128) How can I reset asked questions, for example to show images?**

You can reset asked questions via the three dots overflow menu in the miscellaneous settings.

<br />

<a name="faq129"></a>
**(129) Are ProtonMail, Tutanota supported?**

ProtonMail uses a proprietary email protocol and [does not directly support IMAP](https://protonmail.com/support/knowledge-base/imap-smtp-and-pop3-setup/), so you cannot use FairEmail to access ProtonMail.

Tutanota uses a proprietary email protocol and [does not support IMAP](https://tutanota.com/faq/#imap), so you cannot use FairEmail to access Tutanota.

<br />

<a name="faq130"></a>
**(130) What does message error ... mean?**

A series of lines with orangish or red texts with technical information means that debug mode was enabled in the miscellaneous settings.

The warning *No server found at ...* means that there was no email server registered at the indicated domain name. Replying to the message might not be possible and might result in an error. This could indicate a falsified email address and/or spam.

The error *... ParseException ...* means that there is a problem with a received message, likely caused by a bug in the sending software. FairEmail will workaround this is in most cases, so this message can mostly be considered as a warning instead of an error.

The error *...SendFailedException...* means that there was a problem while sending a message. The error will almost always include a reason. Common reasons are that the message was too big or that one or more recipient addresses were invalid.

The warning *Message too large to fit into the available memory* means that the message was larger than 10 MiB. Even if your device has plenty of storage space Android provides limited working memory to apps, which limits the size of messages that can be handled.

Please see [here](#user-content-faq22) for other error messages in the outbox.

<br />

<a name="faq131"></a>
**(131) Can you change the direction for swiping to previous/next message?**

If you read from left to right, swiping to the left will show the next message. Similarly, if you read from right to left, swiping to the right will show the next message.

This behavior seems quite natural to me, also because it is similar to turning pages.

Anyway, there is a behavior setting to reverse the swipe direction.

<br />

<a name="faq132"></a>
**(132) Why are new message notifications silent?**

Notifications are silent by default on some MIUI versions. Please see [here](http://en.miui.com/thread-3930694-1-1.html) how you can fix this.

There is a bug in some Android versions causing [setOnlyAlertOnce](https://developer.android.com/reference/android/app/Notification.Builder#setOnlyAlertOnce(boolean)) to mute notifications. Since FairEmail shows new message notifications right after fetching the message headers and FairEmail needs to update new message notifications after fetching the message text later, this cannot be fixed or worked around by FairEmail.

Android might rate limit the notification sound, which can cause some new message notifications to be silent.

<br />

<a name="faq133"></a>
**(133) Why is ActiveSync not supported?**

The Microsoft Exchange ActiveSync protocol [is patented](https://en.wikipedia.org/wiki/Exchange_ActiveSync#Licensing) and can therefore not be supported. For this reason you won't find many, if any, other email clients supporting ActiveSync.

The Microsoft Exchange Web Services protocol [is being phased out](https://techcommunity.microsoft.com/t5/Exchange-Team-Blog/Upcoming-changes-to-Exchange-Web-Services-EWS-API-for-Office-365/ba-p/608055).

Note that the desciption of FairEmail starts with the remark that non-standard protocols, like Microsoft Exchange Web Services and Microsoft ActiveSync are not supported.

<br />

<a name="faq134"></a>
**(134) Can you add deleting local messages?**

*POP3*

In the account settings (Setup, step 1, Manage, tap account) you can enable *Leave deleted messages on server*.

*IMAP*

Since the IMAP protocol is meant to synchronize two ways, deleting a message from the device would result in fetching the message again when synchronizing again.

However, FairEmail supports hiding messages, either via the three-dots menu in the action bar just above the message text or by multiple selecting messages in the message list. Basically this is the same as "leave on server" of the POP3 protocol with the advantage that you can show the messages again when needed.

Note that it is possible to set the swipe left or right action to hide a message.

<br />

<a name="faq135"></a>
**(135) Why are trashed messages and drafts shown in conversations?**

Individual messages will rarely be trashed and mostly this happens by accident. Showing trashed messages in conversations makes it easier to find them back.

You can permanently delete a message using the message three-dots *delete* menu, which will remove the message from the conversation. Note that this irreversible.

Similarly, drafts are shown in conversations to find them back in the context where they belong. It is easy to read through the received messages before continuing to write the draft later.

<br />

<a name="faq136"></a>
**(136) How can I delete an account/identity/folder?**

Deleting an account/identity/folder is a little bit hidden to prevent accidents.

* Account: Setup > Step 1 > Manage > Tap account
* Identity: Setup > Step 2 > Manage > Tap identity
* Folder: Long press the folder in the folder list > Edit properties

In the three-dots overflow menu at the top right there is an item to delete the account/identity/folder.

<br />

<a name="faq137"></a>
**(137) How can I reset 'Don't ask again'?**

You can reset all questions set to be not asked again in the miscellaneous settings.

<br />

<a name="faq138"></a>
**(138) Can you add calendar/contact management/synchronizing?**

Calendar and contact management can better be done by a separate, specialized app. Note that FairEmail is a specialized email app, not an office suite.

Also, I prefer to do a few things very well, instead of many things only half. Moreover, from a security perspective, it is not a good idea to grant many permissions to a single app.

You are advised to use the excellent, open source [DAVx⁵](https://f-droid.org/packages/at.bitfire.davdroid/) app to synchronize/manage your calendars/contacts.

Most providers support exporting your contacts. Please [see here](https://support.google.com/contacts/answer/1069522) about how you can import contacts if synchronizing is not possible.

Note that FairEmail does support replying to calendar invites (a pro feature) and adding calendar invites to your personal calendar.

<br />

<a name="faq83"></a>
<a name="faq139"></a>
**(139) How do I fix 'User is authenticated but not connected'?**

In fact this Microsoft Exchange specific error is an incorrect error message caused by a bug in older Exchange server software.

The error *User is authenticated but not connected* might occur if:

* Push messages are enabled for too many folders: see [this FAQ](#user-content-faq23) for more information and a workaround
* The account password was changed: changing it in FairEmail too should fix the problem
* An alias email address is being used as username instead of the primary email address
* An incorrect login scheme is being used for a shared mailbox: the right scheme is *username@domain\SharedMailboxAlias*

The shared mailbox alias will mostly be the email address of the shared account, like this:

```
you@example.com\shared@example.com
```

Note that it should be a backslash and not a forward slash.

<br />

<a name="faq140"></a>
**(140) Why does the message text contain strange characters?**

Displaying strange characters is almost always caused by specifying no or an invalid character encoding by the sending software. FairEmail will assume [ISO 8859-1](https://en.wikipedia.org/wiki/ISO/IEC_8859-1) when no character set or when [US-ASCII](https://en.wikipedia.org/wiki/ASCII) was specified. Other than that there is no way to reliably determine the correct character encoding automatically, so this cannot be fixed by FairEmail. The right action is to complain to the sender.

<br />

<a name="faq141"></a>
**(141) How can I fix 'A drafts folder is required to send messages'?**

To store draft messages a drafts folder is required. In most cases FairEmail will automatically select the drafts folders on adding an account based on [the attributes](https://www.iana.org/assignments/imap-mailbox-name-attributes/imap-mailbox-name-attributes.xhtml) the email server sends. However, some email servers are not configured properly and do not send these attributes. In this case FairEmail tries to identify the drafts folder by name, but this might fail if the drafts folder has an unusual name or is not present at all.

You can fix this problem by manually selecting the drafts folder in the account settings (Setup, step 1, tap account, at the bottom). If there is no drafts folder at all, you can create a drafts folder by tapping on the '+' button in the folder list of the account (tap on the account name in the navigation menu).

Some providers, like Gmail, allow enabling/disabling IMAP for individual folders. So, if a folder is not visible, you might need to enable IMAP for the folder.

Quick link for Gmail: [https://mail.google.com/mail/u/0/#settings/labels](https://mail.google.com/mail/u/0/#settings/labels)

<br />

<a name="faq142"></a>
**(142) How can I store sent messages in the inbox?**

Generally, it is not a good idea to store sent messages in the inbox because this is hard to undo and could be incompatible with other email clients.

That said, FairEmail is able to properly handle sent messages in the inbox. FairEmail will mark outgoing messages with a sent messages icon for example.

The best solution would be to enable showing the sent folder in the unified inbox by long pressing the sent folder in the folder list and enabling *Show in unified inbox*. This way all messages can stay where they belong, while allowing to see both incoming and outgoing messages at one place.

If this is not an option, you can [create a rule](#user-content-faq71) to automatically move sent messages to the inbox or set a default CC/BCC address in the advanced identity settings to send yourself a copy.

<br />

<a name="faq143"></a>
**~~(143) Can you add a trash folder for POP3 accounts?~~**

[POP3](https://en.wikipedia.org/wiki/Post_Office_Protocol) is a very limited protocol. Basically only messages can be downloaded and deleted from the inbox. It is not even possible to mark a message read.

Since POP3 does not allow access to the trash folder at all, there is no way to restore trashed messages.

Note that you can hide messages and search for hidden messages, which is similar to a local trash folder, without suggesting that trashed messages can be restored, while this is actually not possible.

Version 1.1082 added a local trash folder. Note that trashing a message will permanently remove it from the server and that trashed messages cannot be restored to the server anymore.

<br />

<a name="faq144"></a>
**(144) How can I record voice notes?**

To record voice notes you can press this icon in the bottom action bar of the message composer:

![External image](https://github.com/M66B/FairEmail/blob/master/images/baseline_record_voice_over_black_48dp.png)

This requires a compatible audio recorder app to be installed. In particular [this common intent](https://developer.android.com/reference/android/provider/MediaStore.Audio.Media.html#RECORD_SOUND_ACTION) needs to be supported.

For example [this audio recorder](https://f-droid.org/app/com.github.axet.audiorecorder) is compatible.

Voice notes will automatically be attached.

<br />

<a name="faq145"></a>
**(145) How can I set a notification sound for an account, folder or sender?**

Account:

* Enable *Separate notifications* in the advanced account settings (Setup, step 1, Manage, tap account, tap Advanced)
* Long press the account in the account list (Setup, step 1, Manage) and select *Edit notification channel* to change the notification sound

Folder:

* Long press the folder in the folder list and select *Create notification channel*
* Long press the folder in the folder list and select *Edit notification channel* to change the notification sound

Sender:

* Open a message from the sender and expand it
* Expand the addresses section by tapping on the down arrow
* Tap on the bell icon to create or edit a notification channel and to change the notification sound

The order of precendence is: sender sound, folder sound, account sound and default sound.

Setting a notification sound for an account, folder or sender requires Android 8 Oreo or later and is a pro feature.

<br />

<a name="faq146"></a>
**(146) How can I fix incorrect message times?**

Since the sent date/time is optional and can be manipulated by the sender, FairEmail uses the server received date/time by default.

Sometimes the server received date/time is incorrect, mostly because messages were incorrectly imported from another server and sometimes due to a bug in the email server.

In these rare cases, it is possible to let FairEmail use either the date/time from the *Date* header (sent time) or from the *Received* header as a workaround. This can be changed in the advanced account settings: Setup, step 1, Manage, tap account, tap Advanced.

This will not change the time of already synchronized messages. To solve this, long press the folder(s) in the folder list and select *Delete local messages* and *Synchronize now*.

<br />

<a name="faq147"></a>
**(147) What should I know about third party versions?**

You likely came here because you are using a third party build of FairEmail.

There is **only support** on the latest Play store version, the latest GitHub release and the F-Droid build, but **only if** the version number of the F-Droid build is the same as the version number of the latest GitHub release.

F-Droid builds irregularly, which can be problematic when there is an important update. Therefore you are advised to switch to the GitHub release.

The F-Droid version is built from the same source code, but signed differently. This means that all features are available in the F-Droid version too, except for using the Gmail quick setup wizard because Google approved (and allows) one signature only.

Note that you'll need to uninstall the F-Droid build first before you can install a GitHub release because Android refuses to install the same app with a different signature for security reasons.

Note that the GitHub version will automatically check for updates. When desired, this can be turned off in the miscellaneous settings.

Please [see here](https://github.com/M66B/FairEmail/blob/master/README.md#user-content-downloads) for all download options.

If you have a problem with the F-Droid build, please check if there is a newer GitHub version first.

<br />

<a name="faq148"></a>
**(148) How can I use an Apple iCloud account?**

There is a built-in profile for Apple iCloud, but if needed you can find the right settings [here](https://support.apple.com/en-us/HT202304).

When using two-factor authentication you might need to use an [app-specific password](https://support.apple.com/en-us/HT204397).

<br />

<a name="faq149"></a>
**(149) How does the unread message count widget work?**

The unread message count widget shows the number of unread messages either for all accounts or for a selected account, but only for the folders for which new message notifications are enabled.

Tapping on the notification will synchronize all folders for which synchronization is enabled and will open:

* the start screen when all accounts were selected
* a folder list when a specific account was selected and when new message notifications are enabled for multiple folders
* a list of messages when a specific account was selected and when new message notifications are enabled for one folder

<br />

<a name="faq150"></a>
**(150) Can you add cancelling calendar invites?**

Cancelling calendar invites (removing calendar events) requires write calendar permission, which will result in effectively granting permission to read and write *all* calendar events of *all* calendars.

Given the goal of FairEmail, privacy and security, and given that it is easy to remove a calendar event manually, it is not a good idea to request this permission for just this reason.

Inserting new calendar events can be done without permissions with special [intents](https://developer.android.com/guide/topics/providers/calendar-provider.html#intents). Unfortunately, there exists no intent to delete existing calendar events.

<br />

<a name="faq151"></a>
**(151) Can you add backup/restore of messages?**

An email client is meant to read and write messages, not to backup and restore messages. Note that breaking or losing your device, means losing your messages!

Instead, the email provider/server is responsible for backups.

If you want to make a backup yourself, you could use a tool like [imapsync](https://imapsync.lamiral.info/).

If you want to import an mbox file to an existing email account, you can use Thunderbird on a desktop computer and the [ImportExportTools](https://addons.thunderbird.net/nl/thunderbird/addon/importexporttools/) add-on.

<br />

<a name="faq152"></a>
**(152) How can I insert a contact group?**

You can insert the email addresses of all contacts in a contact group via the three dots menu of the message composer.

You can define contact groups with the Android contacts app, please see [here](https://support.google.com/contacts/answer/30970) for instructions.

<br />

<a name="faq153"></a>
**(153) Why does permanently deleting Gmail message not work?**

You might need to change [the Gmail IMAP settings](https://mail.google.com/mail/u/0/#settings/fwdandpop) on a desktop browser to make it work:

* When I mark a message in IMAP as deleted: Auto-Expunge off - Wait for the client to update the server.
* When a message is marked as deleted and expunged from the last visible IMAP folder: Immediately delete the message forever

Note that archived messages can be deleted only by moving them to the trash folder first.

Some background: Gmail seems to have an additional message view for IMAP, which can be different from the main message view.

<br />

<a name="faq154"></a>
**~~(154) Can you add favicons as contact photos?~~**

~~Besides that a [favicon](https://en.wikipedia.org/wiki/Favicon) might be shared by many email addresses with the same domain name~~ ~~and therefore is not directly related to an email address, favicons can be used to track you.~~

<br />

<a name="faq155"></a>
**(155) What is a winmail.dat file?**

A *winmail.dat* file is sent by an incorrectly configured Outlook client. It is a Microsoft specific file format ([TNEF](https://en.wikipedia.org/wiki/Transport_Neutral_Encapsulation_Format)) containing a message and possibly attachments.

You can find some more information about this file [here](https://support.mozilla.org/en-US/kb/what-winmaildat-attachment).

You can view it with for example the Android app [Letter Opener](https://play.google.com/store/apps/details?id=app.letteropener).

<br />

<a name="faq156"></a>
**(156) How can I set up an Office 365 account?**

An Office 365 account can be set up via the quick setup wizard and selecting *Office 365 (OAuth)*.

If the wizard ends with *AUTHENTICATE failed*, IMAP and/or SMTP might be disabled for the account. In this case you should ask the administrator to enable IMAP and SMTP. The procedure is documented [here](https://docs.microsoft.com/en-in/exchange/troubleshoot/configure-mailboxes/pop3-imap-owa-activesync-office-365).

<br />

<a name="faq157"></a>
**(157) How can I set up an Free.fr account?**

Veuillez [voir ici](https://free.fr/assistance/597.html) pour les instructions.

**SMTP est désactivé par défaut**, veuillez [voir ici](https://free.fr/assistance/2406.html) comment il peut être activé.

Veuillez [voir ici](http://jc.etiemble.free.fr/abc/index.php/trucs-astuces/configurer-smtp-free-fr) pour un guide détaillé.

<br />

<a name="faq158"></a>
**(158) Which camera / audio recorder do you recommend?**

To take photos and to record audio a camera and an audio recorder app are needed. The following apps are open source cameras and audio recorders:

* [Open Camera](https://play.google.com/store/apps/details?id=net.sourceforge.opencamera) ([F-Droid](https://f-droid.org/en/packages/net.sourceforge.opencamera/))
* [Audio Recorder](https://play.google.com/store/apps/details?id=com.github.axet.audiorecorder) ([F-Droid](https://f-droid.org/packages/com.github.axet.audiorecorder/))

To record voice notes, etc, the audio recorder needs to support [MediaStore.Audio.Media.RECORD_SOUND_ACTION](https://developer.android.com/reference/android/provider/MediaStore.Audio.Media#RECORD_SOUND_ACTION). Oddly, most audio recorders seem not to support this standard Android action.

<br />

<a name="faq159"></a>
**(159) What are Disconnect's tracker protection lists?**

Please see [here](https://disconnect.me/trackerprotection) for more information about Disconnect's tracker protection lists.

After downloading the lists in the privacy settings, the lists can optionally be used:

* to warn about tracking links on opening links
* to recognize tracking images in messages

Tracking images will be disabled only if the corresponding main 'disable' option is enabled.

Tracking images will not be recognized when the domain is classified as '*Content*', see [here](https://disconnect.me/trackerprotection#trackers-we-dont-block) for more information.

This command can be sent to FairEmail from an automation app to update the protection lists:

```
(adb shell) am startservice -a eu.faircode.email.DISCONNECT.ME
```

Updating once a week will probably be sufficient, please see [here](https://github.com/disconnectme/disconnect-tracking-protection/commits/master) for recent lists changes.

<br />

<a name="faq160"></a>
**(160) Can you add permanent deletion of messages without confirmation?**

Permanent deletion means that messages will *irreversibly* be lost, and to prevent this from happening accidentally, this always needs to be confirmed. Even with a confirmation, some very angry people who lost some of their messages through their own fault contacted me, which was a rather unpleasant experience :-(

<br />

<a name="faq161"></a>
**(161) Can you add a setting to change the primary and accent color?***

If I could, I would add a setting to select the primary and accent color right away, but unfortunately Android themes are fixed, see for example [here](https://stackoverflow.com/a/26511725/1794097), so this is not possible.

<br />


## Soporte

Only the latest Play store version and latest GitHub release are supported. This also means that downgrading is not supported.

Requested features should:

* be useful to most people
* not complicate the usage of FairEmail
* fit within the philosophy of FairEmail (privacy oriented, security minded)
* comply with common standards (IMAP, SMTP, etc)

Features not fulfilling these requirements will likely be rejected. This is also to keep maintenance and support in the long run feasible.

If you have a question, want to request a feature or report a bug, please use [this form](https://contact.faircode.eu/?product=fairemailsupport).

GitHub issues are disabled due to frequent misusage.

Copyright &copy; 2018-2020 Marcel Bokhorst.
