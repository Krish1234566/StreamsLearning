//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    List<Product> list = List.of(
            new Product("apple", 10000),
            new Product("apple", 10000),
            new Product("samsung", 20000),
            new Product("black berry", 15000),
            new Product("lg", 7000));

 System.out.println(list);
   list.forEach(System.out::println);
  list.stream().filter(s->s.name.equals("apple")).forEach(System.out::println);
   list.stream().filter(s->s.name.equals("apple")).findFirst().ifPresent(System.out::println);
   list.stream().filter(s->s.name.equals("samsu")).findFirst().ifPresentOrElse(System.out::println,() -> System.out.println("product not found"));
  list.stream().filter(p->p.price <20000).forEach(System.out::println);
  list.stream().map(p->p.name).forEach(System.out::println);
  list.stream().map(p->p.price).toList().forEach(System.out::println);
   //to increse 15percentage of product price

    list.stream().map(p->new Product(p.name, (int) (p.price * 1.2))).toList().forEach(System.out::println);
   //  System.out.println(list.stream().filter( s -> s.equals("Apple")).map(s-> s+1).collect(Collectors.toList()));
  list.stream().sorted(Comparator.comparingInt(p-> p.price)).toList().forEach(System.out::println);
    List<Product> sortedList = list.stream()
           .sorted(Comparator.comparingInt(Product::getPrice).reversed())
           .toList(); // Or use .collect(Collectors.toList()) for Java <16
    list.stream().distinct().toList().forEach(System.out::println);


    List<Product> distinctList = list.stream()
            .distinct()
            .toList();

    distinctList.forEach(System.out::println);
   /* Set<String> seen = new HashSet<>();
    seen.add("orange");
    seen.add("banana");
    seen.add("orange");
    seen.add("orange");
    System.out.println(seen);*/






}



