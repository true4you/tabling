package tabling.infra;
import tabling.domain.*;

import org.springframework.hateoas.Link;
import org.springframework.hateoas.server.RepresentationModelProcessor;
import org.springframework.stereotype.Component;
import org.springframework.hateoas.EntityModel;

@Component
public class OrderMngHateoasProcessor implements RepresentationModelProcessor<EntityModel<OrderMng>>  {

    @Override
    public EntityModel<OrderMng> process(EntityModel<OrderMng> model) {
        
        return model;
    }
    
}

