package fr.deligeo;

import fr.deligeo.models.Prestation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.time.Month;
import java.time.YearMonth;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
public class Application implements ApplicationRunner {

    private static final Logger LOG = LoggerFactory.getLogger(Application.class);

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        List<Prestation> prestations = Arrays.asList(
            new Prestation(YearMonth.of(2018, Month.DECEMBER), 1, 100),
            new Prestation(YearMonth.of(2019, Month.JANUARY), 4, 40),
            new Prestation(YearMonth.of(2019, Month.SEPTEMBER), 2, 40),
            new Prestation(YearMonth.of(2019, Month.NOVEMBER), 4, 50),
            new Prestation(YearMonth.of(2020, Month.JANUARY), 1, 40),
            new Prestation(YearMonth.of(2020, Month.JANUARY), 2, 80)
        );

        LOG.info("Liste des prestations : {}",prestations);

        /**
         *
         * Créer un service qui calcule et renvoie le prix total des prestations en euros pour chaque année.
         *
         * Le résultat attendu avec l'exemple ci dessus est :
         *  - 100 euros pour l'année 2018
         *  - 440 euros pour l'année 2019
         *  - 200 euros pour l'année 2020
         *
         */
    }
}
