package Aula13RefatoracaoDoAlunoSystem;

public class NotificacaoService {

    public static void enviarEmail(String destinatario, String assunto, String conteudo) {
        System.out.println("[EMAIL] Para: " + destinatario + " | " + assunto + " | " + conteudo);
    }
}
