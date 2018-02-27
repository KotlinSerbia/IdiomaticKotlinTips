package sample2;

import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/**
 * @seehttps://try.kotlinlang.org/#/Kotlin%20Koans/Introduction/Nullable%20types/Task.kt
 */
public class MessageSender {
    public void sendMessageToClient(
            @Nullable Client client,
            @Nullable String message,
            @NotNull Mailer mailer
    ) {
        if (client == null || message == null) return;

        PersonalInfo personalInfo = client.getPersonalInfo();
        if (personalInfo == null) return;

        String email = personalInfo.getEmail();
        if (email == null) return;

        mailer.sendMessage(email, message);
    }
}
