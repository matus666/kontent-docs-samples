// DocSection: delivery_api_get_taxonomy_group
// Tip: Find more about Java/JavaRx SDKs at https://docs.kontent.ai/javaandroid
import com.github.kentico.kontent.delivery;

DeliveryClient client = new DeliveryClient("<YOUR_PROJECT_ID>");

TaxonomyGroup taxonomyGroup = client.getTaxonomyGroup("personas");
// EndDocSection