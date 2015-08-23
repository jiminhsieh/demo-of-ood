package service;

/**
 * Created by jimin on 8/21/15.
 */
public class MailService implements ExternalService {
  private String from;
  private String to;
  private String content;

  public MailService(String from, String to, String content){
    this.from = from;
    this.to = to;
    this.content = content;
  }
  @Override
  public void send() {

  }
}
