package it.partec.tassidicambio;

import it.partec.tassidicambio.service.StartService;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import com.github.lalyos.jfiglet.FigletFont;

@SpringBootApplication
@Slf4j
public class TassidicambioApplication implements CommandLineRunner {


	@Autowired
	private StartService startService;

	public static void main(String[] args) {
		SpringApplication.run(TassidicambioApplication.class, args);
	}

	@Override
	public void run(String[] args) {
		log.info("Start job");
		log.info("************************************************");
		log.info(FigletFont.convertOneLine("INIZIO BATCH"));
		log.info("************************************************");
		try {
			startService.start();
		} catch (Exception e) {
			log.error("Errore di tipo generico",e);
		}
		log.info("************************************************");
		log.info(FigletFont.convertOneLine("FINE BATCH"));
		log.info("************************************************");
		System.exit(0);
	}


}
