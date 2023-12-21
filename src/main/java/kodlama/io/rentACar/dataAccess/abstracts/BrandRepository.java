package kodlama.io.rentACar.dataAccess.abstracts;
//repository veritabanı işleri yapacak sınıflara denir dao ya da repository
//@repository Veritabanı işlemlerini gerçekleştirme yeteneği olan yapıldığı repository sınıfını belirtir.

import org.springframework.data.jpa.repository.JpaRepository;

import kodlama.io.rentACar.entities.concretes.Brand;

//interface interfaceyi extend eder
public interface BrandRepository extends JpaRepository<Brand,Integer>{
	
//springjpa bize bir sürü operasyon sağlıyor.
//spring concretes imiz yok farkındaysan bize bellekte concreteni hazırlamış oluyor.
}
