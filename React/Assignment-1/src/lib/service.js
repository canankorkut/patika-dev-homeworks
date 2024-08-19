import axios from 'axios';

export default async function getData(Number) {
    const {data: user} = await axios.get("https://jsonplaceholder.typicode.com/users/" + Number);
    const {data: posts} = await axios.get("https://jsonplaceholder.typicode.com/posts?id=" + Number);
    
    // console.log(user);
    // console.log(posts);
    return {
        ...user,
        posts
    };
}