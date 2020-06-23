// DocSection: filtering_get_items_of_type
List<NameValuePair> params = DeliveryParameterBuilder.params()
  // Gets items of content type Product
  .inFilter("system.type", Arrays.asList("article", "product", "news"))
// EndDocSection
