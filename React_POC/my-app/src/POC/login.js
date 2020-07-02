import React, { Component } from 'react';
import '../App.css';
import Select from 'react-select';
import CreatableSelect from "react-select/creatable";
import Test from "./Test";


class Login extends Component {
    state = {
        selectedCountry: "",
        options: [
            { value: 'Australia', label: 'Australia' },
            { value: 'Canada', label: 'Canada' },
            { value: 'Denmark', label: 'Denmark' },
            { value: 'India', label: 'India' },
            { value: 'China', label: 'China' },
            { value: 'Pakistan', label: 'Pakistan' },
            { value: 'Newzealand', label: 'Newzealand' },
            { value: 'France', label: 'France' },

        ],
        role: [
            { label: "Admin", value: "Admin" },
            { label: "User", value: "User" }
        ],
        selectedRole: ""
    }

    handleChange = async (event) => {
        let value = event ? event.value : "";
        await this.setState(({ selectedCountry: value }))
        let findInMap = await this.findCountryFromList(value, this.state.options)
        if (findInMap === false) {
            this.setState(prevState => ({
                options: [
                    ...prevState.options, { "value": value, "label": value }
                ],
            }))
        }

    }
    handleRoleChange = async (event) => {
        let value = event ? event.value : "";
        await this.setState(({ selectedRole: value }))
    }
    handleInputChange = (inputValue) => {
        this.setState(({ selectedCountry: inputValue }))
    };
    findCountryFromList = (value, options) => {
        for (let v of options.values()) {
            if (v.value === value || value === "") {
                return true;
            }
        }
        return false;
    }
    render() {

        const formatOptionLabel = () => (
            <div id="testing">"{this.state.selectedCountry}" not found <button>Add & Select</button></div>

        )
        return (
            <div className="loginPage container">
                <center>  <label>Role:</label>
                    <div className="Role">  <Select
                        placeholder="Select Role"
                        name="role"
                        options={this.state.role}
                        width="10px"
                        onChange={this.handleRoleChange}
                    /></div>
                    <div className="App">   <Test
                        options={this.state.options}
                        selectedCountry={this.state.selectedCountry}
                        handleChange={this.handleChange}
                        handleInputChange={this.handleInputChange}
                        formatOptionLabel={formatOptionLabel}
                        role={this.state.selectedRole}
                    /></div></center>

            </div>)
    }
}

export default Login;
