package com.example.salah.exo1_vues_intents;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.AdapterView;
import android.widget.ListView;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private CustomAdapter customAdapter;

    // I tried to commit here created the a variable
    int a;
    // Now i'm trying another comment
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        List<Book> list = new ArrayList<Book>();

        Book book = new Book();
        book.setTitle("C in a Nutshell, 2nd Edition");
        book.setCover(R.drawable.ic_c_in_a_nutshell_2nd_edition);
        book.setBigCover(R.drawable.c_in_a_nutshell_2nd_edition);
        book.setAuthor("Peter Prinz, Tony Crawford");
        book.setAnnée("2015");
        book.setEditeur("O'Reilly Media");
        book.setRsume("The new edition of this classic O'Reilly reference provides clear, detailed explanations of every feature in the C language and runtime library, including multithreading, type-generic macros, and library functions that are new in the 2011 C standard (C11). If you want to understand the effects of an unfamiliar function, and how the standard library requires it to behave, you'll find it here, along with a typical example.\n" +
                "Ideal for experienced C and C++ programmers, this book also includes popular tools in the GNU software collection. You'll learn how to build C programs with GNU Make, compile executable programs from C source code, and test and debug your programs with the GNU debugger.");
        list.add(book);

        book = new Book();
        book.setTitle("Essential C# 6.0, 5th Edition");
        book.setCover(R.drawable.ic_essential_c_6);
        book.setBigCover(R.drawable.essential_c_6_5th_edition);
                book.setAuthor("Mark Michaelis, Eric Lippert");
        book.setAnnée("2015");
        book.setEditeur("Addison-Wesley");
        book.setRsume("Essential C# 6.0 is a well-organized, no-fluff guide to the latest versions of C# for programmers at all levels of experience. Fully updated to reflect new C# 6.0 and .NET 4.6 features and patterns, it will help you write C# code that's simple, powerful, robust, secure, and maintainable.\n" +
                "This book's authors are world-class C# experts: long-time Microsoft MVP and Regional Director Mark Michaelis and Eric Lippert, formerly principal developer on Microsoft's C# compiler team. Together, they cover the entire language, illustrating key constructs with succinct examples and offering a complete foundation for successful C# development.\n" +
                "Essential C# 6.0 makes it easy to program with any version of C#, whether you're creating new code or maintaining existing systems. Separate indexes for C# versions 4, 5, and 6 help you quickly find version-specific answers with accompanying visual indicators that help you identify which language innovations will work when. This edition also includes a set of best-practice C# Coding Guidelines updated to leverage C# 6.0 constructs.");
        list.add(book);

        book = new Book();
        book.setTitle("Frontend Architecture for Design Systems");
        book.setCover(R.drawable.ic_frontend_architecture_for_design_systems);
        book.setBigCover(R.drawable.frontend_architecture_for_design_systems);
                book.setAuthor("Micah Godbolt");
        book.setAnnée("2016");
        book.setEditeur("O'Reilly Media");
        book.setRsume("Imagine what a large-scale web project would look like if frontend development were not treated as an add-on, but as an equal partner with backend development and content strategy. This practical book takes experienced web developers through the new discipline of frontend architecture, including the latest tools, standards, and best practices that have elevated frontend web development to an entirely new level.\n" +
                "Using real-world examples, case studies, and practical tips and tricks throughout, author Micah Godbolt introduces you to the four pillars of frontend architecture. He also provides compelling arguments for developers who want to embrace the mantle of frontend architect and fight to make it a first-class citizen in their next project.");
        list.add(book);

        book = new Book();
        book.setTitle("Learning JavaScript, 3rd Edition");
        book.setCover(R.drawable.ic_learning_javascript_3rd_edition);
        book.setBigCover(R.drawable.learning_javascript_3rd_edition);
        book.setAuthor("Ethan Brown");
        book.setAnnée("2016");
        book.setEditeur("O'Reilly Media");
        book.setRsume("This is an exciting time to learn JavaScript. Now that the latest JavaScript specification - ECMAScript 6.0 (ES6) - has been finalized, learning how to develop high-quality applications with this language is easier and more satisfying than ever. This practical book takes programmers (amateurs and pros alike) on a no-nonsense tour of ES6, along with some related tools and techniques.\n" +
                "Author Ethan Brown (Web Development with Node and Express) not only guides you through simple and straightforward topics (variables, control flow, arrays), but also covers complex concepts such as functional and asynchronous programming. You'll learn how to create powerful and responsive web applications on the client, or with Node.js on the server.");
        list.add(book);

        book = new Book();
        book.setTitle("Multiplayer Game Programming");
        book.setCover(R.drawable.ic_multiplayer_game_programming);
        book.setBigCover(R.drawable.multiplayer_game_programming);
        book.setAuthor("Josh Glazer, Sanjay Madhav");
        book.setAnnée("2015");
        book.setEditeur("Addison-Wesley");
        book.setRsume("Networked multiplayer games are a multibillion dollar business: some games now attract tens of millions of players. In this practical, code-rich guide, Joshua Glazer and Sanjay Madhav guide you through every aspect of engineering them. Drawing on their immense experience as both game developers and instructors, the authors lead you through building a robust multiplayer architecture, and creating every engine-level system. You'll learn through in-depth working code examples for two complete games: an action game and a real time strategy (RTS) game.\n" +
                "First, Madhav and Glazer review the essentials of networking and network programming from the standpoint of game developers. Next, they walk through managing game data transmission, updating game objects across the network, and organizing the devices that join your game. You'll learn how to ensure reliable performance despite the Internet's inherent inconsistencies, and how to design game code for maximum security and scalability. The authors conclude by addressing two increasingly crucial issues: incorporating gamer services and hosting your games in the cloud.");
        list.add(book);

        book = new Book();
        book.setTitle("Professional ASP.NET 4 in C# and VB");
        book.setCover(R.drawable.ic_professional_asp);
        book.setBigCover(R.drawable.professional_asp_net_4_in_c_and_vb);
        book.setAuthor("Scott Hanselman, Devin Rader, Bill Evje");
        book.setAnnée("2010");
        book.setEditeur("Wrox");
        book.setRsume("ASP.NET is about making you as productive as possible when building fast and secure web applications. Each release of ASP.NET gets better and removes a lot of the tedious code that you previously needed to put in place, making common ASP.NET tasks easier. With this book, an unparalleled team of authors walks you through the full breadth of ASP.NET and the new and exciting capabilities of ASP.NET 4. The authors also show you how to maximize the abundance of features that ASP.NET offers to make your development process smoother and more efficient.");
        list.add(book);

        book = new Book();
        book.setTitle("Professional JavaScript for Web Developers, 3rd Edition");
        book.setCover(R.drawable.ic_professional_javascript_for_web_developers_3rd_edition);
        book.setBigCover(R.drawable.professional_javascript_for_web_developers_3rd_edition);
        book.setAuthor("Nicholas C. Zakas");
        book.setAnnée("2012");
        book.setEditeur("O'Reilly Media");
        book.setRsume("If you want to achieve JavaScript's full potential, it is critical to understand its nature, history, and limitations. To that end, this updated version of the bestseller by veteran author and JavaScript guru Nicholas C. Zakas covers JavaScript from its very beginning to the present-day incarnations including the DOM, Ajax, and HTML5. Zakas shows you how to extend this powerful language to meet specific needs and create dynamic user interfaces for the web that blur the line between desktop and internet. By the end of the book, you'll have a strong understanding of the significant advances in web development as they relate to JavaScript so that you can apply them to your next website.");
        list.add(book);

        book = new Book();
        book.setTitle("Scalable Big Data Architecture");
        book.setCover(R.drawable.ic_scalable_big_data_architecture);
        book.setBigCover(R.drawable.scalable_big_data_architecture);
        book.setAuthor("Bahaaldine Azarmi");
        book.setAnnée("2016");
        book.setEditeur("Apress");
        book.setRsume("This book highlights the different types of data architecture and illustrates the many possibilities hidden behind the term \"Big Data\", from the usage of No-SQL databases to the deployment of stream analytics architecture, machine learning, and governance.\n" +
                "Scalable Big Data Architecture covers real-world, concrete industry use cases that leverage complex distributed applications , which involve web applications, RESTful API, and high throughput of large amount of data stored in highly scalable No-SQL data stores such as Couchbase and Elasticsearch. This book demonstrates how data processing can be done at scale from the usage of NoSQL datastores to the combination of Big Data distribution.\n" +
                "When the data processing is too complex and involves different processing topology like long running jobs, stream processing, multiple data sources correlation, and machine learning, it's often necessary to delegate the load to Hadoop or Spark and use the No-SQL to serve processed data in real time.\n" +
                "This book shows you how to choose a relevant combination of big data technologies available within the Hadoop ecosystem. It focuses on processing long jobs, architecture, stream data patterns, log analysis, and real time analytics. Every pattern is illustrated with practical examples, which use the different open sourceprojects such as Logstash, Spark, Kafka, and so on.");
        list.add(book);


        ListView listView = (ListView) findViewById(R.id.listView);
        customAdapter = new CustomAdapter(this, list);
        listView.setAdapter(customAdapter);

        listView.setOnItemClickListener(new AdapterView.OnItemClickListener() {
            @Override
            public void onItemClick(AdapterView<?> parent, View view, int position, long id) {

                Intent intent = new Intent(getApplication(), Main2Activity.class);

                Book book = (Book) customAdapter.getItem(position);
                intent.putExtra("book", book);
                startActivity(intent);
            }
        });

    }
}
