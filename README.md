# IntantEmailM

ACTION_SENDTO >> 
Действие действия: отправить сообщение кому-либо, указанному в данных.
Ввод: getData()URI, описывающий цель.
Вывод: ничего.
Постоянное значение: «android.intent.action.SENDTO»

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
