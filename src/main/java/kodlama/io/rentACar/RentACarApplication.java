package kodlama.io.rentACar;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RentACarApplication {

	public static void main(String[] args) {
		SpringApplication.run(RentACarApplication.class, args);
	}
//entity veri tabanı nesneleri
//api isimlendirmelerinde çoğul kullanılır.
//repository veritabanı işleri yapacak sınıflara denir dao ya da repository
//postman da swagger de ikisinin de amacı api isteği yaratmak
//postman daha profesyonel iken swagger daha hızlıdır.
}
