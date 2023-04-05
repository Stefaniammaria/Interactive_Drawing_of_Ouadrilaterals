import Model.Entities.Question;
import Model.Entities.User;
import Model.Persistence.AbstractPersistence;
import Model.Persistence.ConnectionFactory;
import View.GameView;
import View.StartUpPage;

public class Main {

    public static void main(String[] args) {
        ConnectionFactory cf = new ConnectionFactory();
        cf.startConnection();
        cf.stopConnection();
        /*AbstractPersistence<User> repoUser = new AbstractPersistence<>(User.class);
        AbstractPersistence<User> repoUser1 = new AbstractPersistence<>(User.class);
        User user = new User();
        user.setNume("Maracine");
        user.setPrenume("Stefania");
        user.setUsername("Stefania");
        user.setParola("parola");
        user.setTip("admin");
        user.setEmail("maracine_stefania@yahoo.com");
        User user1 = new User();
        user1.setNume("Popescu");
        user1.setPrenume("Edi");
        user1.setUsername("Edi");
        user1.setParola("1234");
        user1.setTip("elev");
        user1.setEmail("edipopescu@yahoo.com");*/
        //repoUser.insert(user);
        //repoUser1.insert(user1);

        StartUpPage st = new StartUpPage();

        /*AbstractPersistence<Question> repoQuestion = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion2 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion3 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion4 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion5 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion6 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion7 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion8 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion9 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion10 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion11 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion12 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion13 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion14 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion15 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion16 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion17 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion18 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion19 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion20 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion21 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion22 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion23 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion24 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion25 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion26 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion27 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion28 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion29 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion30 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion31 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion32 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion33 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion34 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion35 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion36 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion37 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion38 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion39 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion40 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion41 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion42 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion43 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion44 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion45 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion46 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion47 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion48 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion49 = new AbstractPersistence<>(Question.class);
        AbstractPersistence<Question> repoQuestion50 = new AbstractPersistence<>(Question.class);*/

        Question question1 = new Question();
        question1.setEnunt("Ce este un patrulater?");
        question1.setRaspuns("Un patrulater este o figura geometrica cu patru laturi");

        Question question2 = new Question();
        question2.setEnunt("Câte laturi are un patrulater?");
        question2.setRaspuns("Un patrulater are patru laturi");

        Question question3 = new Question();
        question3.setEnunt("Dacă diagonala unui paralelogram are lungimea 10 cm și unghiul format de diagonale are măsura de 120 de grade, atunci care este lungimea fiecărei laturi?");
        question3.setRaspuns("5 cm");

        Question question4 = new Question();
        question4.setEnunt("Avem ABCD patrulater convex cu AB = 6 cm, BC = 11 cm, CD = 8 cm si DA = 4 cm. Cat este perimetrul patrulaterului?");
        question4.setRaspuns("29 cm");

        Question question5 = new Question();
        question5.setEnunt("Avem MNPQ patrulater convex si unghiurile m(<M) = 85, m(<N) = 49, m(<P) = 115. Cat este m(<B) = 50?");
        question5.setRaspuns("111 grade");

        Question question6 = new Question();
        question6.setEnunt("Într-un patrulater dreptunghi cu diagonală NR de 5 cm și lungimea unei laturi MP de 3 cm, care este lungimea celeilalte laturi?");
        question6.setRaspuns("4 cm");

        Question question7 = new Question();
        question7.setEnunt("Trapezul cu bazele 14 cm şi 18 cm, iar înălţimea 9 cm are aria?");
        question7.setRaspuns("144 cm2");

        Question question8 = new Question();
        question8.setEnunt("Rombul cu diagonalele 26 cm şi 9 cm are aria?");
        question8.setRaspuns("117 cm2");

        Question question9 = new Question();
        question9.setEnunt("Pătratul cu perimetrul 36 cm are aria?");
        question9.setRaspuns("81 cm2");

        Question question10 = new Question();
        question10.setEnunt("Un dreptunghi cu laturile 0,8 m şi 30 m are aria?");
        question10.setRaspuns("24 cm2");

        Question question11 = new Question();
        question11.setEnunt("Paralelogramul MNPQ are perimetrul de 52 cm şi MQ=NQ=13cm. Atunci triunghiul MNQ este?");
        question11.setRaspuns("Dreptunghic isoscel");

        Question question12 = new Question();
        question12.setEnunt("Dacă pătratul ABCD are aria egală cu 64 cm2, atunci perimetrul său este egal cu?");
        question12.setRaspuns("32 cm");

        Question question13 = new Question();
        question13.setEnunt("Ce este un romb cu diagonale congruente?");
        question13.setRaspuns("Un patrat");

        Question question14 = new Question();
        question14.setEnunt("Trapezul dreptunghic cu baza mare de 20 cm , baza mică de 12 cm şi latura perpendiculară pe baze de 8 cm are aria egală cu?");
        question14.setRaspuns("128 cm2");

        Question question15 = new Question();
        question15.setEnunt("Un dreptunghi are lăţimea de 6 cm şi lungimea cât dublul lăţimii. Aria dreptunghiului este de?");
        question15.setRaspuns("72 cm2");

        Question question16 = new Question();
        question16.setEnunt("Aria unui romb cu diagonalele de 10 cm şi 15 cm este de?");
        question16.setRaspuns("75 cm2");

        Question question17 = new Question();
        question17.setEnunt("Dreptunghiul MNPR cu diagonala NR de 10 cm are MP?");
        question17.setRaspuns("10 cm");

        Question question18 = new Question();
        question18.setEnunt("În paralelogramul ABCD avem m(<B) = 50 grade. Atunci m(<A) = ?");
        question18.setRaspuns("130 grade");

        Question question19 = new Question();
        question19.setEnunt("Aflati perimetrul unui patrat stiind ca aria este 16cm patrati.");
        question19.setRaspuns("16 cm");

        Question question20 = new Question();
        question20.setEnunt("Aflați aria unui pătrat știind că perimetrul său este egal cu 40 cm.");
        question20.setRaspuns("100 cm2");

        Question question21 = new Question();
        question21.setEnunt("Calculați perimetrul și aria unui pătrat cu latura de 5 cm.");
        question21.setRaspuns("25 cm2");

        Question question22 = new Question();
        question22.setEnunt("Ce măsură are suplementul unui unghi al cărui complement are măsura de 60°?");
        question22.setRaspuns("150 grade");

        Question question23 = new Question();
        question23.setEnunt("Ce este o bisectoare într-un patrulater?");
        question23.setRaspuns("O bisectoare in patrulater imparte un unghi in doua unghiuri egale");

        Question question24 = new Question();
        question24.setEnunt("Ce este o mediană într-un patrulater?");
        question24.setRaspuns("Mediana este segmentul care unește un vârf al triunghiului cu mijlocul laturii opuse.");

        Question question25 = new Question();
        question25.setEnunt("Ce este o diagonala secundară?");
        question25.setRaspuns("O diagonală secundara este diagonala care unește varful din stanga jos cu cel din dreapta sus.");

        Question question26 = new Question();
        question26.setEnunt("Cum se calculează perimetrul unui pătrat?");
        question26.setRaspuns("Perimetrul este latura ori 4");

        Question question27 = new Question();
        question27.setEnunt("Cum se calculează perimetrul unui dreptunghi?");
        question27.setRaspuns("Perimetrul este 2 ori lungime plus 2 ori latime");

        Question question28 = new Question();
        question28.setEnunt("Cum se calculează aria unui romb?");
        question28.setRaspuns("Aria unui romb este egala cu diagonala 1 ori diagonala 2 supra 2.");

        Question question29 = new Question();
        question29.setEnunt("Cum se calculează aria unui pătrat?");
        question29.setRaspuns("Aria unui patrat este egala cu latura la patrat.");

        Question question30 = new Question();
        question30.setEnunt("Cum se calculează aria unui dreptunghi?");
        question30.setRaspuns("Aria unui dreptunghi este egala cu lungimea ori latimea.");

        Question question31 = new Question();
        question31.setEnunt("Cum se calculează aria unui paralelogram?");
        question31.setRaspuns("Aria unui paralelogram este egala cu baza ori inaltimea.");

        Question question32 = new Question();
        question32.setEnunt("Cum se calculează aria unui trapez?");
        question32.setRaspuns("Aria unui trapez se calculează prin înmulțirea înălțimii patrulaterului cu suma bazelor sale, împărțită la 2.");

         Question question33 = new Question();
        question33.setEnunt("Ce este un romb?");
        question33.setRaspuns("Un romb este un patrulater cu toate laturile egale și unghiurile egale două câte două.");

        Question question34 = new Question();
        question34.setEnunt("Ce este un pătrat?");
        question34.setRaspuns("Un pătrat este un patrulater cu toate laturile egale și unghiuri drepte.");

        Question question35 = new Question();
        question35.setEnunt("Ce este un dreptunghi?");
        question35.setRaspuns("Un dreptunghi este un patrulater cu unghiuri drepte opuse două câte două.");

        Question question36 = new Question();
        question36.setEnunt("Ce este un paralelogram?");
        question36.setRaspuns("Un paralelogram este un patrulater în care laturile opuse sunt paralele.");

        Question question37 = new Question();
        question37.setEnunt("Ce este un trapez?");
        question37.setRaspuns("Un trapez este un patrulater care are cel puțin două laturi paralele.");

        Question question38 = new Question();
        question38.setEnunt("Care este formula pentru perimetrul unui patrulater?");
        question38.setRaspuns("Formula pentru perimetrul unui patrulater este: P = a + b + c + d, unde a, b, c și d sunt laturile patrulaterului.");

        Question question39 = new Question();
        question39.setEnunt("Care este formula pentru aria unui patrulater?");
        question39.setRaspuns("Formula pentru aria unui patrulater este: A = 1/2 * d1 * d2 * sinx, unde d1 și d2 sunt diagonalele, iar x este unghiul dintre ele.");

        Question question40 = new Question();
        question40.setEnunt("Ce este un patrulater inscris?");
        question40.setRaspuns("Un patrulater inscris este un patrulater ale cărui vârfuri se află toate pe un singur cerc.");

        Question question41 = new Question();
        question41.setEnunt("Ce este un patrulater circumscris?");
        question41.setRaspuns("Un patrulater circumscris este un patrulater ale cărui laturi sunt toate tangente la un singur cerc.");

        Question question42 = new Question();
        question42.setEnunt("Ce este o simetrie a unui patrulater?");
        question42.setRaspuns("O simetrie a unui patrulater este o operație care păstrează patrulaterul neschimbat, dar îl mută într-o altă poziție sau îl întoarce.");

        Question question43 = new Question();
        question43.setEnunt("Ce este un patrulater neregulat?");
        question43.setRaspuns("Un patrulater neregulat este un patrulater care nu este regulat.");

        Question question44 = new Question();
        question44.setEnunt("Ce este un patrulater regulat?");
        question44.setRaspuns("Un patrulater regulat este un patrulater în care toate laturile și toate unghiurile sunt egale.");

        Question question45 = new Question();
        question45.setEnunt("Ce este o diagonală principală?");
        question45.setRaspuns("O diagonală principală este diagonala care unește varful din stanga sus cu cel din dreapta jos.");

        Question question46 = new Question();
        question46.setEnunt("Ce este un patrulater concav?");
        question46.setRaspuns("Un patrulater concav este un patrulater în care cel puțin un unghi interior are mai mult de 180 de grade.");

        Question question47 = new Question();
        question47.setEnunt("Ce este un patrulater convex?");
        question47.setRaspuns("Un patrulater convex este un patrulater în care toate unghiurile interioare sunt mai mici de 180 de grade.");

        Question question48 = new Question();
        question48.setEnunt("Ce este diagonala unui patrulater?");
        question48.setRaspuns("Diagonala unui patrulater este o dreaptă care unește două vârfuri neadiacente.");

        Question question49 = new Question();
        question49.setEnunt("Ce este un unghi al unui patrulater?");
        question49.setRaspuns("Un unghi al unui patrulater este o măsură a deschiderii dintre două laturi adiacente.");

        Question question50 = new Question();
        question50.setEnunt("Ce este un vârf al unui patrulater?");
        question50.setRaspuns("Un vârf al unui patrulater este un punct unde se întâlnesc două laturi.");



        /*repoQuestion.insert(question1);
        repoQuestion2.insert(question2);
        repoQuestion3.insert(question3);
        repoQuestion4.insert(question4);
        repoQuestion5.insert(question5);
        repoQuestion6.insert(question6);
        repoQuestion7.insert(question7);
        repoQuestion8.insert(question8);
        repoQuestion9.insert(question9);
        repoQuestion10.insert(question10);
        repoQuestion11.insert(question11);
        repoQuestion12.insert(question12);
        repoQuestion13.insert(question13);
        repoQuestion14.insert(question14);
        repoQuestion15.insert(question15);
        repoQuestion16.insert(question16);
        repoQuestion17.insert(question17);
        repoQuestion18.insert(question18);
        repoQuestion19.insert(question19);
        repoQuestion20.insert(question20);
        repoQuestion21.insert(question21);
        repoQuestion22.insert(question22);
        repoQuestion23.insert(question23);
        repoQuestion24.insert(question24);
        repoQuestion25.insert(question25);
        repoQuestion26.insert(question26);
        repoQuestion27.insert(question27);
        repoQuestion28.insert(question28);
        repoQuestion29.insert(question29);
        repoQuestion30.insert(question30);
        repoQuestion31.insert(question31);
        repoQuestion32.insert(question32);
        repoQuestion33.insert(question33);
        repoQuestion34.insert(question34);
        repoQuestion35.insert(question35);
        repoQuestion36.insert(question36);
        repoQuestion37.insert(question37);
        repoQuestion38.insert(question38);
        repoQuestion39.insert(question39);
        repoQuestion40.insert(question40);
        repoQuestion41.insert(question41);
        repoQuestion42.insert(question42);
        repoQuestion43.insert(question43);
        repoQuestion44.insert(question44);
        repoQuestion45.insert(question45);
        repoQuestion46.insert(question46);
        repoQuestion47.insert(question47);
        repoQuestion48.insert(question48);
        repoQuestion49.insert(question49);
        repoQuestion50.insert(question50);*/


    }


}
