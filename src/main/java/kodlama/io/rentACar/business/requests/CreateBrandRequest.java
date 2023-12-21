package kodlama.io.rentACar.business.requests;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class CreateBrandRequest {
	private String name;
	//son kullanıcı id ni bilemez otomatik olarak artar o yüzden sadece name 
	//son kullanıcıya bir şey veriyorsak response
	//son kullanıcıdan bir data alıyorsak request
}
