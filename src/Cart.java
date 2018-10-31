public class Cart {

    private Item items[];
    private int itemQuantities[];
    private int itemCount;
    private int totalQuantity;
    private double totalPrice;

    //Default Constructor

    Cart() {

        items = new Item[10];

        itemQuantities = new int[10];

        itemCount = 0;

        totalQuantity = 0;

        totalPrice = 0;

    }

    Cart(int cartSize) {

        if (cartSize < 0) {
            items = new Item[10];

            itemQuantities = new int[10];

        } else {
            items = new Item[cartSize];

            itemQuantities = new int[cartSize];

        }
        itemCount = 0;
        totalPrice = 0;

    }

    int getItemCount() {
        return itemCount;
    }

    double getTotalPrice() {
        return totalPrice;
    }

    int getTotalQuantity() {
        return totalQuantity;
    }

    int getCartSize() {
        return items.length;
    }

    void setCartSize(int newCartSize) {

        if (newCartSize > 0) {
            if (newCartSize > items.length) {
                Item temp[] = items;
                items = new Item[newCartSize];
                items = temp;
            } else {
                if (itemCount < newCartSize) {
                    Item temp[] = items;

                    items = new Item[newCartSize];

                    items = temp;

                } //End of if condition
            } // End of else
        } //End of outer if condition
    } //End of method
//Method to add item into cart

    void add(Item item, int addQuantity) {
        int pos = -1;

        if (itemCount < items.length) {
            if (addQuantity > 0) {
                pos = search(item);

                if (pos == -1) {
                    items[itemCount] = item;
                    itemQuantities[itemCount] = addQuantity;
                    itemCount++;
                } //End of inner if condition

                else {
                    itemQuantities[pos] += addQuantity;
                }

                totalQuantity += addQuantity;

                totalPrice += (addQuantity * item.getPrice());

                System.out.println("Item" + item.getName() + " added successfully.");
            }//End of the outer if condition
            else
                System.out.println("ERROR: Invalid quantity.");
        }//End of outer most if condition
        else
            System.out.print("ERROR: Cart is full.");

        calculateTotals();
    }//End of void add method
    
    private void calculateTotals() {
        totalQuantity = 0;
        totalPrice = 0;
        for(int i = 0; i < items.length; i++) {
            int quantity = itemQuantities[i];
            if (quantity > 0) {
                totalQuantity += quantity;
                totalPrice += items[i].getPrice() * quantity;
            }
        }
    }

    void remove(Item item, int removeQuantity) //Method to delete an item from cart
    {
        int pos = -1;
        if (itemCount > 0) {
            if (removeQuantity > 0) {
                pos = search(item);

                if (pos == -1) {
                    System.out.print("ERROR: Cart does not contains " + item.getName());
                }//End of if condition

                else {
                    if (removeQuantity > itemQuantities[pos]) {
                        totalQuantity -= itemQuantities[pos];

                        totalPrice -= itemQuantities[pos] * item.getPrice();

                        itemQuantities[pos] = 0;
                        //Loops from found position to current available quantity
                        for (int x = pos; x < itemCount; x++)

                            //Shift each record left

                            items[x] = items[x + 1]; //syntax

                        //Decrease the record counter by one

                        itemCount--;

                    }//End of inner if condition


                    else {
                        itemQuantities[pos] -= removeQuantity;
                        totalQuantity -= removeQuantity;
                        totalPrice -= removeQuantity * item.getPrice();
                    }//End of else
                    System.out.println("Item " + item.getName() + " removed successfully.");
                }//Emd of else
            }//End of outer if condition
            else
                System.out.println("ERROR: Invalid quantity.");
        }//End of outer most if condition
        else
            System.out.println("ERROR: Cart is empty.");
    }//End of method


    private int search(Item item) {
        int found = -1;

        //Loops till number of quantity available in the cart
        for (int x = 0; x < itemCount; x++) {
            if (items[x].getName().compareToIgnoreCase(item.getName()) == 0) {
                found = x;
                break;
            }//End of if cond

        }//End of for loop
        return found;
    }//End of private method

    String formattedOutput() {
        String result = "";

        //Loops till number of items available in the cart

        for (int x = 0; x < itemCount; x++)
            result += items[x] + ", " + itemQuantities[x] + ", "
                    + itemQuantities[x] * items[x].getPrice();
        result += "Total Quantity: " + totalQuantity;
        result += "Total Price: " + totalPrice;
        return result;
    }
}