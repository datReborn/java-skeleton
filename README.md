# Java Skeleton

Welcome to the Credit Suisse Coding Challenge 2018. Below are instructions for getting started on the Challenge!

### Competition Rules

Challenge Questions are available on our website at www.credit-suisse.com/codingchallenge.

To get started, first fork this repository in order to obtain your own copy. Please note that per Challenge rules <b>this repository must be visible to us</b>.

This can be achieved by either keeping the repository public, or by adding CS-CodingChallenge as a viewer to the private repository.

### In your repository

You'll find several packages in your repository, most of which you shouldn't touch - these are set out below:

- <b> Do not modify or delete files that aren't in the answers package.</b>

- You may add new java libraries. To do this, add new dependencies to your pom.xml file, ensuring not to delete any lines that are already present.

- Please note this skeleton is written using Java 8. This is the only Java version available in the Challenge.

- A guide to adding Maven dependencies can be found on the Maven website.

- To add code to be run, modify the files in the <i>answers</i> package. These are numbered according to which question they answer.

### Deploying your solution

In order to submit your code to the Automated Evaluator, it first needs to be deployed to Heroku. For this, you'll need to create a Heroku server:

#### Connecting Heroku to your Git repository

1) Set up a Heroku account. This is free, and can be set up at www.heroku.com
2) Download the Herou Command Line tools (www.devcenter.heroku.com/articles/heroku-cli)
3) In a command prompt, log in to your Heroku account using the command:
    <code>heroku login</code>
4) Navigate to your git repository in the command prompt.
5) Run:
    <code>heroku create</code>

#### Deploying to Heroku

1) If you have added any dependencies to your solution, ensure they are in your Maven file. Failure to do so will result in your Heroku server failing to run.
2) Add files to be deployed to Heroku using <code>git add "file-name"</code> 
3) Commit the files for deployment using <code>git commit -m "Your commit message here"</code>
4) Deploy to Heroku using <code>git push heroku master</code> (Please note, this doesn't push to your original repository, so remember to push your changes there as well frequently).
5) Your solution will be deployed to Heroku. You can see the logs to your server using <code>heroku logs --tail</code>

<b>Please note - for your solution to be considered valid, you must grant access to your Heroku server to coding.challenge@credit-suisse.com</b>. This can be done on the Heroku website.

#### Tell us you've deployed

At our website, we have a tab listed <i>Register Heroku</i>. Here, you should tell us your Heroku name, and GitHub repository address. To start the process, you'll need your UserID (provided in your starter email) and the email address you signed up with. Once this is complete, please allow an hour for your score to be updated on the leaderboard. You only need to complete this step once.
