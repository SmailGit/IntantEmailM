# IntantEmailM

ACTION_SEND >> 
public static final String ACTION_SEND
Действие Действия: Передайте данные кому-нибудь другому. Кому доставляются данные, не уточняется; получатель этого действия должен спросить пользователя, куда должны быть отправлены данные.
При запуске намерения SEND вы обычно должны обернуть его в средство выбора (через createChooser(Intent, CharSequence)), которое предоставит пользователю надлежащий интерфейс для выбора способа отправки ваших данных и позволит вам указать подсказку, указывающую, что они делают.
Ввод: getType()тип MIME отправляемых данных. get*Extra может иметь поле EXTRA_TEXT или EXTRA_STREAM, содержащее данные для отправки. При использовании EXTRA_TEXT тип MIME должен быть «текстовый/обычный»; в противном случае это должен быть MIME-тип данных в EXTRA_STREAM. Используйте */*, если тип MIME неизвестен (это позволит только отправителям, которые могут обрабатывать общие потоки данных). Если вы используете EXTRA_TEXT, вы также можете предоставить EXTRA_HTML_TEXTклиентам возможность извлекать ваш текст с форматированием HTML.
Начиная с Build.VERSION_CODES.JELLY_BEAN, отправляемые данные могут передаваться через setClipData(android.content.ClipData). Это позволяет использовать FLAG_GRANT_READ_URI_PERMISSIONпри обмене контентом: URI и другие расширенные функции ClipData. При использовании этого подхода вы все равно должны указать те же данные через поля EXTRA_TEXTили EXTRA_STREAM, описанные ниже, для совместимости со старыми приложениями. Если вы не установите ClipData, он будет скопирован туда для вас при вызове Context#startActivity(Intent).
Начиная с Build.VERSION_CODES.O, если CATEGORY_TYPED_OPENABLEпередано, то Uris, переданный либо через, EXTRA_STREAMлибо через setClipData(android.content.ClipData), может быть открыт только как файлы с типизированным ресурсом с использованием ContentResolver#openTypedAssetFileDescriptor(Uri, String, Bundle).
Необязательные стандартные дополнения, которые могут интерпретироваться некоторыми получателями как соответствующие: EXTRA_EMAIL, EXTRA_CC, EXTRA_BCC, EXTRA_SUBJECT.
Вывод: ничего.
Постоянное значение: «android.intent.action.SEND»

EXTRA_SUBJECT >>
Строка с темой письма.
public static final String EXTRA_SUBJECT
Постоянная строка, содержащая желаемую строку темы сообщения.
Постоянное значение: «android.intent.extra.SUBJECT»

EXTRA_TEXT >>
Строка с телом письма.
public static final String EXTRA_TEXT
Константа CharSequence, связанная с Intent, используется ACTION_SENDдля предоставления литеральных данных для отправки.
Обратите внимание, что это может быть CharSequence со стилем, поэтому вы должны использовать Bundle.getCharSequence()для его извлечения.
Постоянное значение: «android.intent.extra.TEXT»

EXTRA_EMAIL >>
Строковый массив всех адресов электронной почты получателей "Кому".
public static final String EXTRA_EMAIL
String[], содержащий адреса электронной почты, на которые следует доставить.
Постоянное значение: «android.intent.extra.EMAIL»
