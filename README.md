# git.test
Mam takie zadanie do pracy:
Stwórz prosty RESTowy serwis, który zwróci informacje
Identyfikator
Login
Nazwa
Typ
url do avatara
data stworzenia
API serwisu powinno wyglądać jak poniżej:
GET /user/info
{
"id": "...",
"login": "...",
"name": "…",
"type": "...",
"avatarUrl": „”,
"createdAt": "..."
}
GitHub API do serwisu jest pod adresem https://api.github.com/users/octocat 
Serwis powinien być zakodowany w Java. Spodziewamy się zastosowania dobrych praktyk kodowania. Projekt powinien być możliwy do zbudowania za pomocą Maven lub Gradle.

Chciałem to zadanie zrobić trochę bardziej i je rozbudować. Np. Że mógłbym dorzucić jakieś jsp z instrukcją, gdzie z jednej strony mógłbyś po prostu poprzez GET w przeglądarce przejść do info u Userze, ale też np. poprzez formularz na tym widoku, który przesłałby to POSTEM. (Mógłbym potem do tego dorzucić Hibernate'a i wrzucać tych userów do bazy danych) a następnie np. wyświetlać wszystkich wyszukanych z bazy w jakimś widoku. 
Tylko czy to nadal będzie RESTowy serwis? :)
No ale zanim zacznę wszystko komplikować, to chciałbym ogarnąć podstawy :)
1. Jak najsprawniej, najlepiej napisać takie połączenie z API?
  1. Mam taki kawałek kodu od prowadzącego zajęcia, gdzie łączył się z bazą danych. (w paczce demo.git BookHttpClient.java)
  2. znalazłem sobie coś coś takiego co jest wykomentowane w /demo.git Appication.java czyli "User user = restTemplate.getForObject" Co w ogóle jest w tym przypadku super, a nie znałem tego i mapuje mi cały obiekt od razu bez ciągnięcia poszczególnych atrybutów, więc wydaje mi się to dobrą opcją. I w ogóle od razu działa i wyświetla w konsoli. PYTANIE: Czy mogę tego użyć w kontrolerze, bo coś mi nie wychodzi i jak to zastosować ze zmiennym URI : czyli tak żeby każdorazowo możnabyło podawać usera? Wydaje mi się że tam w kontrolerze dobrze zacząłem to pisać z tym żeby w adresie User był do podstawienia, zależnie od tego co wpisze użytkownik.
W sumie to samo pytanie mam do tego pierwszego sposobu, jaką tam ustawić ścieżkę do API, i jak to zrobić w kontrolerze, żeby pobierać za każdym razem innego usera.
No rozumiem, że jeżeli nie robiłbym tego przez ten Jsonowy obiekt, to musiałbym w kontrolerze robić @requestparam na każdy potrzebny parametr Usera?
