Feature: TraceParts Product search

Scenario: Search the product and open in 3D viewer

Given user load the webpage
When Search product Photoelectric Sensor in the search box
Then Select the first product
And verify the product title
Then Verify the Product description
And Right click the 3D model image
Then Click on left to display the left side image of the product