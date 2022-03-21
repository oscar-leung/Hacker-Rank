- The following are the Products and Packaging Boxes information
  of Acme Inc.
- Each product in the given dictionary/hash contains possible packing boxes
  that can be used to ship the product when it is ordered
- Each of the packaging boxes gives you the amount of the given product that
  can be packed in the box
- Packing box names are just reference names, they are not dimensions
  of the packing box
- Following are product details where the data structure will be consistent
  but the number of products and boxes available for the given product will vary
- You can use as many boxes as you like from the boxes list

product_boxes = {
'IoT Box': {
'BOX-06x02x02': 2.0,
'BOX-20x20x12': 16.0,
'BOX-16x16x16': 9.0,
'BOX-08x08x08': 4.0,
},
'Scale-Up! The Business Game': {
'BOX-16x16x16': 7.0,
'BOX-10x08x08': 3.0,
'BOX-23x17x12': 14.0,
},
'Basic Cash Drawer': {},
'Shoes': {
'BOX-06x02x02': 6.0,
}
}

- Following data contains order details with an order number, the ordered
  products, and their initial demand of product quantity by customer
- Orders data structure will be consistent but data in orders will vary

orders = {
'S0101': {
'Scale-Up! The Business Game': 15.0,
'IoT Box': 47.0,
'Basic Cash Drawer': 10.0,
'Shoes': 5.0,
},
'S0102': {
'IoT Box': 2.0,
'Scale-Up! The Business Game': 10.0,
},
'S0103': {
'Shoes': 50.0,
'IoT Box': 500.0,
'Scale-Up! The Business Game': 32.0,
'Basic Cash Drawer': 10.0,
},
}

- Write a program/script/solution to find and return the best and least
  possible packing boxes to be used for shipping the ordered products
  in an order.
- Also, each box returned should give a count of product quantity to be packed
  in each selected boxe(s) from the given list.

Expected return :

packed_orders = {
'S0101': {
'Scale-Up! The Business Game': {
'packs': [('BOX-23x17x12', 14.0),
('BOX-10x08x08', 1.0)],
'quantity': 15.0
},
'IoT Box': {
'packs': [('BOX-20x20x12', 16.0),
('BOX-20x20x12', 16.0),
('BOX-16x16x16', 9.0),
('BOX-08x08x08', 4.0),
('BOX-06x02x02', 2.0)],
'quantity': 47.0
},
'Basic Cash Drawer': {
'packs': [],
'quantity': 10.0
},
'Shoes': {
'packs': [('BOX-06x02x02', 5.0)],
'quantity': 5.0
}
},
'S0102': {...},
'S0103': {...},
}
====================================
Internal Use only
Start Time : 2021-02-00 03:10 PST
End Time : 2021-0-00 03:45 PST
====================================
Your solution goes below :
