package Lambdas2;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class EmailManager {
    public static void main(String[] args) {
        List<Email> emailList = createEmailList();
        //tylko wysłane emaile
        List<Email> sentEmails = filterByPredicate(emailList, (email)-> email.isSent());
        System.out.println("Wysłane maile:");
        System.out.println(sentEmails);
        //filtrowanie maili, w których nadawca lub odbiorca ma wskazany adres email
        String bartMail = "bart@example.com";
        List<Email> bartEmails = filterByPredicate(emailList,
                (email -> email.getRecipient().equals(bartMail) || email.getSender().equals(bartMail)));
        System.out.println("Maile przefiltrowane na podstawie nadawcy lub odbiorcy");
        System.out.println(bartEmails);
    }

    private static <T> List<T> filterByPredicate(List<T> list, Predicate<T> predicate){
        List<T> newList = new ArrayList<>();
        for (T t:
             list) {
            if(predicate.test(t)){
                newList.add(t);
            }
        }
        return newList;
    }

    private static List<Email> createEmailList() {
        List<Email> emails = new ArrayList<>();
        emails.add(new Email(
                "joe@example.com",
                "barbara@example.com",
                "Kup bułki",
                "Cześć!, Kup proszę bułki, gdy będziesz wracać z pracy.",
                false)
        );
        emails.add(new Email(
                "carl@example.com",
                "joe@example.com",
                "Nowa inwestycja",
                "Siema! Musimy omówić temat nowej inwestycji, pasuje Ci jutro?",
                true)
        );
        emails.add(new Email(
                "joe@example.com",
                "bart@example.com",
                "Wypad na miasto",
                "Cześć. Idziemy dzisiaj wieczorem z chłopakami na miasto. Dołączasz do nas?",
                true)
        );
        return emails;
    }
}
