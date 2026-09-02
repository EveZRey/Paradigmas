@RestController
public class ReactivoController {
    @GetMapping(value = "/stream", produces = MediaType.TEXT_EVENT_STREAM_VALUE)
    public Flux<String> streamDeDatos() {
        return Flux.interval(Duration.ofSeconds(1))
                   .map(sec -> "Dato número: " + sec);
    }
}
