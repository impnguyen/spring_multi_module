package customer.multimodule.handlers;

import java.util.stream.Stream;

import org.springframework.stereotype.Component;

import com.sap.cds.services.cds.CdsService;
import com.sap.cds.services.handler.EventHandler;
import com.sap.cds.services.handler.annotations.After;
import com.sap.cds.services.handler.annotations.ServiceName;

import cds.gen.catalogservice.CatalogService_;
import customer.module1.MyPrinter;
import cds.gen.catalogservice.Books;

@Component
@ServiceName(CatalogService_.CDS_NAME)
public class CatalogServiceHandler implements EventHandler {

	@After(event = CdsService.EVENT_READ)
	public void discountBooks(Stream<Books> books) {

        MyPrinter p = new MyPrinter("message from printer module class");
        p.printMessage();

		books.filter(b -> b.getTitle() != null && b.getStock() != null)
		.filter(b -> b.getStock() > 200)
		.forEach(b -> b.setTitle(b.getTitle() + " (discounted)"));
	}

}