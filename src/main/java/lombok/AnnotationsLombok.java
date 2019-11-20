package lombok;

// model java beans

@AllArgsConstructor  //dpdake lpmstruktor z wszystkimi polami klasowymi w argumencie
@Data       // dodaje gettery, settery i to String() do wszystkich pól klasowych
public class AnnotationsLombok {
    private  String login;
    private String password;



}
