import axios from 'axios';

// import { API_BASE_URL } from 'constants/index';

export async function getIndexs() {
    const response = await axios.get(`http://localhost:8080/index`);


    return response.data;
}