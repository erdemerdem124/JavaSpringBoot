package kodlama.io.rentACar.entities.concretes;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table; //persistence diyince aklına veriyi tutmak gelmeli aklına
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

//request istek demektir apiye gönderdiğiniz datadır
//response bizim ona verdiğimiz yanıttır.
//veri tabanı nesnelerimizi asla son kullanıcıya açmamalıyız.
//@ anotasyonlar bilgi toplayan bize bilgi veren şeylerdir.
//ctrl+shift+o kullanılmayan importları uçurur
@Getter // nesnenin sadece getterini oluşturur
@Setter // nesnenin sadece setterini oluşturur
//@Getter ve @Setter @Data demek
@NoArgsConstructor // parametresiz constructor oluşturur
@Entity // bir veri tabanı varlığısın
@AllArgsConstructor // parametreli constructor oluşturuyor
//@Data //getter setter oluşturuyor aynı zamanda parametresiz constructor oluşturuyor
@Table(name="brands")
public class Brand {
	
	@Column(name="name")
	private String name;
	
	@Id //primary key anlamına geliyorsun demektir.
	@GeneratedValue(strategy=GenerationType.IDENTITY)  //id yi otomatik arttırmak
	@Column(name="id")
	private int id;

}
