Feature: Check the tabs on home page
		
Scenario: Different page should load on clicking the tab
Given User is in the landing page of "Greenfield"
When User clicks on the link for "FBCP Application Cluster"
Then User is directed to page
And User clicks on the dashboard link "Dashboard"
Then User is directed to dashboard 
