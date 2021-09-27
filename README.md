## Lab 3: Interfaces and Code Reviews

In this lab, you will be implementing a class using a variety of interfaces. You will also be writing test cases for this class. Afterwards, you and your group will be reviewing each other's code and making revisions before pulling changes in.

### Task 1: Understanding the domain
The provided program consists of Traders and the items that they sell: Creatures and Vehicles. We have provided you with the following in `src/main/java`:

- `Trader.java`: A fully implemented Trader class. You should read through this file to understand it, and you will need to modify a single TODO in it.
- `Drivable.java` and `Domesticatable.java`: Interfaces for the class you will be constructing. You will either want to implement one or both of these in your class.
- `Tradable.java`: An interface that you must implement in the class you're writing.
- `Horse.java`: An example of a class that implements the various interfaces.

In `test/main/java` we have given you the following file:
- `HorseTest.java`: An example test suite for the `Horse` class provided.

### Task 2: Implementing a class with interfaces
In this task you'll be writing a class that implements the `Tradable` interface and at least one of the other provided interfaces (i.e. `Drivable`, `Domesticatable`, or both). In addition, you should be writing test cases for your class and adding at least one instance of your new class to `Trader.java`'s main method.

You should be working on a **branch** of the repository, as opposed to committing directly to the master branch. If you need help creating a branch, refer to the instructions from the README of the [Lab 1: Git and Jave activity](https://q.utoronto.ca/courses/233945/pages/lab-1-activity-using-git-and-java).

You are free to do write whatever you'd like here. However, include *at least* one problem in your code such as:
- Bad (or missing) documentation
- Incorrect naming conventions (for your class, variables, or methods)
- Poor code style
- Missing test case(s)

It will be your teammates' task to find and point out these errors in Task 4, and you'll be doing the same to them. You may include other issues, but you'll be responsible for fixing these later!

To summarize this task:

1. Create a branch of this project: all of your work should be done in this branch! Name it with your **github name**.
2. Create a class in `src/main/java` that implements Tradable and also implements Domesticatable, Drivable, or both.
3. Create a test class in `test/main/java` that test the class you wrote.
4. Add at least one instance of your new class to the `main` method of `Trader.java`.
5. Include a flaw in your code somewhere (see the above list.)

You may want to refer to `Horse.java` as an example.

### Task 3: Making a pull request
Once you've implemented your class and introduced flaws, add, commit, and push your code: then make a pull request! Include a description of what you wrote (e.g. the class you implemented).

After the pull request is made, let your teammates know! Once you and some of your other teammates have finished Task 3, you can move on to Task 4 to review each other's pull requests.

### Task 4: Reviewing other pull requests
In this task, you will be **reviewing** your teammate's pull requests. On GitHub, go to the tab labelled **Pull requests**.

You should see all of the pull requests made by your teammates. Click on one that you want to review (or you can assign Reviewers to each pull request: this is up to you!) Ideally, we want at least 2 members to review each pull request at this step!

You should see a description of their pull request and the changes that they've made. Look at the **Files changed** tab to see the changes they've made.

Read through their code carefully. Remember: you all should have introduced intentional flaws to your code! When you identify a problem, you can hover over the relevant line and click the **+** symbol. Enter your comment and then select **Start a review**.

It may help to mark files as **viewed** (in the top-right corner), as this will collapse them when you're done. While it may not be needed for this lab, it will make things easier in larger projects!

Do the same for any other flaws you find and add more review comments as needed. Afterwards, select **Finish your review** in the top right corner and finish with a summary of your review. Afterwards, select **Request changes**: your teammate will then need to address these changes and resolve them. 

For further reading, see the [GitHub docs for reviewing proposed changes](https://docs.github.com/en/github/collaborating-with-pull-requests/reviewing-changes-in-pull-requests/reviewing-proposed-changes-in-a-pull-request).

You and your teammates will be repeating both this task (Task 4) and Task 5 until no more flaws are found. After which, move on to Task 6: Approving pull requests!

### Task 5: Revising your pull request
Once your code has been reviewed, it's time for you to revise it accordingly! You can see all of the comments by looking at the **Conversation** tab. Resolve them as you handle them.

Once you've finished updating your code, simply add, commit, and push it once again. Let your teammates know, and repeat Task 4 and 5 as many times as needed until there are no problems to be found!

### Task 6: Approving pull requests
If you've finished looking throuhg a teammate's pull requests and found no flaws, submit another review (via the **Review changes** button) and write a message. Select **Approve** and submit your review.

If at least one other team member has also approved of the changes: feel free to merge in the pull request!

### Task 7: Merging pull requests
In the **Conversations** tab, you can select **Merge pull request** so long as there are no problems or conflicts. Once a pull request has been approved by two other members, merge the pull request in.

Note that there will be merge conflicts that may need to be addressed once the first pull request has been merged in: make sure to handle these as needed!