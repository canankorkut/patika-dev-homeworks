const blogs = [
    { name: "Blog 1", author: "Author 1"},
    { name: "Blog 2", author: "Author 2"},
    { name: "Blog 3", author: "Author 3"}
]

function listBlogs() {
    blogs.forEach((blog) => {
        console.log(blog.name);
    })
}

function createBlog(newBlog) {
    const promise1 = new Promise((resolve,reject) => {
        if(newBlog) {
            blogs.push(newBlog);
            resolve("Blog created.");
        } else {
            reject("Blog not created.");
        }
    });
    return promise1;
}

async function showBlogs() {
    try {
        await createBlog({ name: "Blog 4", author: "Author 4"});
        listBlogs();
    } catch(error) {
        console.log(error);
    }
}

showBlogs();