 // Brain Scratchers
// DOUBLE OR NOTHING
//    public static void main(String[] args) {
//
//
//        // This is a game where the user picks an initial number, and the opposing "user" doubles that number.
//        // Then, the user should double THAT number. This goes on until someone guesses incorrectly or gives up!
//
//        // We have a problem here. The user should double the previous number
//        // With our current program flow and layout, that would be VERY tedious.
//
//        // But there is a way we could break this code apart into separate pieces of functionality,
//        // calling those pieces when we need them.
//
//        Scanner scanner = new Scanner(System.in);
//
//        boolean shouldContinue = true;
//        int number = 0;
//
//        System.out.println("Let's play a game. You say a number and I'll repeat that number doubled.");
//        System.out.println("Then, you have to repeat that doubled number back, doubled on itself!\n");
//        System.out.println("Go ahead and pick a number: ");
//
//
//        while (shouldContinue){
//
//
//            // Maybe, some of those methods could return data values like an int
//            int userInput = scanner.nextInt();
//
//            // Perhaps some will just execute code and not return a value (void)
//            if ((number != 0) && (userInput != number * 2)){
//                System.out.println("Oof your lose!");
//                return;
//            }
//
//            System.out.println("...");
//            System.out.println(".....");
//            number = userInput * 2;
//
//            // Some others could take in an int as an argument and return a value like a boolean
//            System.out.printf("The double number is %s", number);
//            System.out.println("-------------------------------\n");
//            System.out.println("Want to continue? (y/n)");
//            shouldContinue = scanner.next().equalsIgnoreCase("y");
//        }
//        System.out.println("**********************");
//        System.out.println("Ok, see ya!");
//
//    }


//ANIMAL FARM
//    public static void main(String[] args) {
//
//
//        Scanner scanner = new Scanner(System.in);
//
//        System.out.println("Do you have a doggo? (y/n)");
//        String input = scanner.next();
//
//        if (input.equals("y")){
//            System.out.println("Awesome! What is their name?");
//            input = scanner.next();
//            System.out.printf("%s is such a great name! Have any other dogs? (y/n)", input);
//            input = scanner.next();
//            if (input.equals("y")){
//                System.out.println("How many dogs??");
//                int doggoCount = scanner.nextInt();
//                if (doggoCount < 3){
//                    System.out.println("That sounds like just the right amount for a peaceful house!");
//                }else if (doggoCount > 3 && doggoCount < 6){
//                    System.out.printf("I bet you stay busy with %s dogs!", doggoCount);
//                }else{
//                    System.out.println("OMG you have a farm! How do you manage them??");
//                }
//            }
//        }else{
//            System.out.println("Ok! How about a kitty? (y/n)");
//            input = scanner.next();
//            if (input.equals("y")){
//                System.out.println("Awesome! What is their name?");
//                input = scanner.next();
//                System.out.printf("%s is such a great name! Have any other cats? (y/n)", input);
//                input = scanner.next();
//                if (input.equals("y")){
//                    System.out.println("How many cats??");
//                    int kittyCount = scanner.nextInt();
//                    if (kittyCount < 3){
//                        System.out.println("That sounds like just the right amount for a peaceful house!");
//                    }else if (kittyCount > 3 && kittyCount < 6){
//                        System.out.printf("I bet you stay busy with %s cats!", kittyCount);
//                    }else{
//                        System.out.println("OMG you have a farm! How do you manage them??");
//                    }
//                }
//            }else {
//                System.out.println("Hmm... no dogs or cats. Any other animals? (y/n)");
//                input = scanner.next();
//                if (input.equals("y")){
//                    System.out.println("Awesome! What is their name?");
//                    input = scanner.next();
//                    System.out.printf("%s is such a great name! Have any other animals? (y/n)", input);
//                    input = scanner.next();
//                    if (input.equals("y")){
//                        System.out.println("How many animals??");
//                        int animalCount = scanner.nextInt();
//                        if (animalCount < 3){
//                            System.out.println("That sounds like just the right amount for a peaceful house!");
//                        }else if (animalCount > 3 && animalCount < 6){
//                            System.out.printf("I bet you stay busy with %s animals!", animalCount);
//                        }else{
//                            System.out.println("OMG you have a farm! How do you manage them??");
//                        }
//                    }
//                }
//            }
//        }
//    }